CREATE TABLE itexus.roles (
    id      INT         NOT NULL    AUTO_INCREMENT,
    name    VARCHAR(50) NOT NULL    UNIQUE,
    PRIMARY KEY (id)
);

INSERT INTO itexus.roles (name)
VALUES ('ADMIN');

INSERT INTO itexus.roles (name)
VALUES ('USER');

INSERT INTO itexus.roles (name)
VALUES ('GUEST');