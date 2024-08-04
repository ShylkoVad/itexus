CREATE TABLE itexus.phone_numbers (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    user_id         INT NOT NULL,
    phone_number    VARCHAR(15) NOT NULL,
    UNIQUE INDEX IDX_PHONE_NUMBERS_ID_UNIQUE (id ASC),
    CONSTRAINT FK_PHONE_NUMBERS_USER_ID_USERS_ID
    FOREIGN KEY (user_id)
    REFERENCES itexus.users(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

INSERT INTO itexus.phone_numbers (user_id, phone_number)
VALUES ('1', '375297191205');

INSERT INTO itexus.phone_numbers (user_id, phone_number)
VALUES ('1', '375291111111');

INSERT INTO itexus.phone_numbers (user_id, phone_number)
VALUES ('2', '375290000000');