CREATE DATABASE REDDITDO;

USE REDDITDO;

CREATE TABLE Usuarios
(
	IdUsuario INT NOT NULL AUTO_INCREMENT,
    NombreUsuario VARCHAR(100),
    NickNameUsuario VARCHAR(35),
    ClaveUsuario VARCHAR(35),
    CorreoUsuario VARCHAR(60),
    PRIMARY KEY (IdUsuario)
);

CREATE TABLE Topicos
(
	IdTopico INT NOT NULL AUTO_INCREMENT,
    NombreTopico VARCHAR(200),
    FechaCreacionTopico  DATETIME,
    IdUsuario INT NOT NULL,
    EstadoTopico BIT,
    PRIMARY KEY (IdTopico),
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario)
);

CREATE TABLE Publicaciones
(
	IdPublicacion INT NOT NULL AUTO_INCREMENT,
    TituloPublicacion VARCHAR(100),
    ContenidoPublicacion VARCHAR(10000),
    ImagenPublicacion VARCHAR(10000),
    FechaPublicacion DATETIME,
    LikesPublicacion NUMERIC(18,0),
    IdUsuario INT NOT NULL,
    PRIMARY KEY(IdPublicacion),
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario)
);

CREATE TABLE PublicacionesTopicos
(
	IdPublicacionTopico INT NOT NULL AUTO_INCREMENT,
    IdPublicacion INT NOT NULL,
    IdTopico INT NOT NULL,
    PRIMARY KEY (IdPublicacionTopico),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion),
    FOREIGN KEY (IdTopico) REFERENCES Topicos(IdTopico)
);

CREATE TABLE Comentarios
(
	IdComentario INT NOT NULL AUTO_INCREMENT,
    ContenidoComentario VARCHAR(10000),
    FechaComentario DATETIME,
    IdUsuario INT NOT NULL,
    IdPublicacion INT NOT NULL,
    PRIMARY KEY (IdComentario),
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion)
);