CREATE TABLE IF NOT EXISTS users
(
    id       INT AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name     VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (email)
) ENGINE innoDB;

