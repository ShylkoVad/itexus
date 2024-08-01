CREATE TABLE itexus.user_roles (
    user_id INT,
    role_id INT,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES itexus.users(id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES itexus.roles(id) ON DELETE CASCADE
);

INSERT INTO itexus.user_roles (user_id, role_id)
VALUES ('1', '1');