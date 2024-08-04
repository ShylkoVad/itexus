CREATE TABLE itexus.user_roles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    role_id INT NOT NULL,
    CONSTRAINT FK_USERS_ROLES_USER_ID_USERS_ID FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT FK_USERS_ROLES_ROLE_ID_ROLES_ID FOREIGN KEY (role_id) REFERENCES roles (id)

);

INSERT INTO itexus.user_roles (user_id, role_id)
VALUES ('1', '1');

INSERT INTO itexus.user_roles (user_id, role_id)
VALUES ('1', '3');

INSERT INTO itexus.user_roles (user_id, role_id)
VALUES ('2', '2');