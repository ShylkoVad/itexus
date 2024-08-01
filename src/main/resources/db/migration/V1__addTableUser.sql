-- DROP TABLE IF EXISTS itexus.users;
CREATE TABLE IF NOT EXISTS itexus.users (
    id          INT             NOT NULL AUTO_INCREMENT,
    first_name  VARCHAR(50)     NOT NULL,
    last_name   VARCHAR(50)     NOT NULL,
    email       VARCHAR(100)    NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

INSERT INTO itexus.users (first_name, last_name, email)
VALUES ('Вадим', 'Шилько', 'shilko_vad@mail.ru');