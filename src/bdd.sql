CREATE TABLE Activite (
                          idActivite INT PRIMARY KEY,
                          libelleActivite VARCHAR(255),
                          heureDebut DATETIME,
                          duree TIME
);

CREATE TABLE Batiment (
                          idBatiment INT PRIMARY KEY,
                          idEtablissement INT,
                          nomBatiment VARCHAR(255),
                          FOREIGN KEY (idEtablissement) REFERENCES Etablissement(idEtablissement)
);

CREATE TABLE Cellule (
                         idCellule INT PRIMARY KEY,
                         idQuartier INT,
                         typeCellule VARCHAR(255),
                         capacite INT,
                         estPleine BOOLEAN,
                         FOREIGN KEY (idQuartier) REFERENCES Quartier(idQuartier)
);

CREATE TABLE Detenu (
                        idDetenu INT PRIMARY KEY,
                        nomDetenu VARCHAR(255),
                        prenomDetenu VARCHAR(255),
                        dateNaissance DATE,
                        adresseCivile VARCHAR(255),
                        idEtablissement INT,
                        idBatiment INT,
                        idFichePenale INT,
                        semiLibre BOOLEAN,
                        idActivite INT,
                        estDangereux BOOLEAN,
                        FOREIGN KEY (idEtablissement) REFERENCES Etablissement(idEtablissement),
                        FOREIGN KEY (idBatiment) REFERENCES Batiment(idBatiment),
                        FOREIGN KEY (idFichePenale) REFERENCES FichePenale(idFichePenale),
                        FOREIGN KEY (idActivite) REFERENCES Activite(idActivite)
);

CREATE TABLE Etablissement (
                               idEtablissement INT PRIMARY KEY,
                               dateOuverture DATE,
                               dateFermeture DATE,
                               nomEtablissement VARCHAR(255),
                               nbDetenuGreffe INT,
                               nbDetenuDetention INT
);

CREATE TABLE FichePenale (
                             idFichePenale INT PRIMARY KEY,
                             debutPeine DATE,
                             finPeine DATE
);

CREATE TABLE Quartier (
                          idQuartier INT PRIMARY KEY,
                          nomQuartier VARCHAR(255),
                          typeQuartier VARCHAR(255),
                          idBatiment INT,
                          FOREIGN KEY (idBatiment) REFERENCES Batiment(idBatiment)
);

CREATE TABLE TypeBatiment (
                              idTypeBatiment INT PRIMARY KEY,
                              typeBatiment VARCHAR(255),
                              mineurBatiment BOOLEAN,
                              sexeBatiment VARCHAR(10),
                              FOREIGN KEY (idTypeBatiment) REFERENCES Batiment(idBatiment)
);

CREATE TABLE AdministrationPenitentiaire (
                                             id INT PRIMARY KEY AUTO_INCREMENT,
                                             entiteId INT,
                                             FOREIGN KEY (entiteId) REFERENCES EntiteAdministrationPenitentiaire(id)
);

CREATE TABLE EntiteAdministrationPenitentiaire (
                                                   id INT PRIMARY KEY AUTO_INCREMENT,
                                                   nom VARCHAR(255),
                                                   typeEntite VARCHAR(255)
);

CREATE TABLE BureauDeLaDetention (
                                     id INT PRIMARY KEY AUTO_INCREMENT,
                                     nom VARCHAR(255),
                                     FOREIGN KEY (nom) REFERENCES EntiteAdministrationPenitentiaire(nom)
);

CREATE TABLE BureauDuGreffe (
                                id INT PRIMARY KEY AUTO_INCREMENT,
                                nom VARCHAR(255),
                                FOREIGN KEY (nom) REFERENCES EntiteAdministrationPenitentiaire(nom)
);

CREATE TABLE PersonnelBureauDeLaDetention (
                                              id INT PRIMARY KEY AUTO_INCREMENT,
                                              nom VARCHAR(255),
                                              prenom VARCHAR(255),
                                              idBureau INT,
                                              FOREIGN KEY (idBureau) REFERENCES BureauDeLaDetention(id)
);

CREATE TABLE PersonnelBureauDuGreffe (
                                         id INT PRIMARY KEY AUTO_INCREMENT,
                                         nom VARCHAR(255),
                                         prenom VARCHAR(255),
                                         idBureau INT,
                                         FOREIGN KEY (idBureau) REFERENCES BureauDuGreffe(id)
);

CREATE TABLE Incident (
                          idIncident INT PRIMARY KEY,
                          dateIncident DATETIME,
                          description TEXT,
                          idPersonnelBureauDeLaDetention INT,
                          FOREIGN KEY (idPersonnelBureauDeLaDetention) REFERENCES PersonnelBureauDeLaDetention(id),
                          idDetenus INT,
                          FOREIGN KEY (idDetenus) REFERENCES Detenu(idDetenu)
);

