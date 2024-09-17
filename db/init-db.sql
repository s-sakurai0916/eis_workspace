create user 'app_user'@'%' identified by 'appUserPassword';
grant select,insert,update,delete on eis_db.* to 'app_user'@'%';

CREATE TABLE test_users (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'ユーザーの一意の識別子',
    name VARCHAR(50) NOT NULL COMMENT 'ユーザーの名前',
    name_ruby VARCHAR(50) NOT NULL COMMENT 'ユーザーの名前のフリガナ',
    email VARCHAR(100) NOT NULL UNIQUE COMMENT 'ユーザーのメールアドレス',
    password VARCHAR(255) NOT NULL COMMENT 'ユーザーのパスワード',
    street VARCHAR(100) NOT NULL COMMENT '住所の詳細（例：通り名や番地）',
    building VARCHAR(100) COMMENT 'マンション名や建物名',
    city VARCHAR(50) NOT NULL COMMENT '市区町村',
    pref VARCHAR(20) NOT NULL COMMENT '都道府県',
    postal_code VARCHAR(10) NOT NULL COMMENT '郵便番号。10文字まで',
    gender CHAR(1) NOT NULL COMMENT '性別。ISO 5218に従い、1文字のコード（0: 不明, 1: 男性, 2: 女性, 9: 適用不能）で保存',
    created_at timestamp NULL DEFAULT NULL COMMENT '登録日',
    created_by int DEFAULT NULL COMMENT '登録ユーザ',
    updated_at timestamp NULL DEFAULT NULL COMMENT '更新日',
    updated_by int DEFAULT NULL COMMENT '更新ユーザ',
    PRIMARY KEY(id)
) COMMENT = 'ユーザ(テスト用)';