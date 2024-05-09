USE DEVLOOPING;
-- Definición de tabla USER_TYPE (tabla independiente)
CREATE TABLE USER_TYPE (
    id_usertype INTEGER PRIMARY KEY AUTO_INCREMENT,
    name_type VARCHAR(255) NOT NULL,
    desc_type VARCHAR(255) NOT NULL
);
-- Definición de tabla USER (depende de USER_TYPE)
CREATE TABLE `USER` (
    id_user INTEGER PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) UNIQUE NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password_hashed VARCHAR(255) NOT NULL,
    created_at DATE NOT NULL,
    deactivated_at DATE,
    status VARCHAR(255),
    profile_pic_url VARCHAR(255),
    user_type_id INTEGER NOT NULL,
    CONSTRAINT USER_USER_TYPE_FK FOREIGN KEY (user_type_id) REFERENCES USER_TYPE(id_usertype) ON DELETE CASCADE ON UPDATE CASCADE
);
