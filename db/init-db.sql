create user 'app_user'@'%' identified by 'appUserPassword';
grant select,insert,update,delete on eis_db.* to 'app_user'@'%';

CREATE TABLE test_user (
    id int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
    name varchar(40) NOT NULL COMMENT '氏名',
    name_ruby varchar(80) DEFAULT NULL COMMENT 'フリガナ',
    gender tinyint(1) DEFAULT 0 COMMENT '性別',
    address varchar(200) DEFAULT NULL COMMENT '住所',
    created_at timestamp NULL DEFAULT NULL COMMENT '登録日',
    created_by int DEFAULT NULL COMMENT '登録ユーザ',
    updated_at timestamp NULL DEFAULT NULL COMMENT '更新日',
    updated_by int DEFAULT NULL COMMENT '更新ユーザ',
    PRIMARY KEY(id)
) COMMENT = 'ユーザ(テスト用)';