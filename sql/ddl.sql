CREATE TABLE `testdb`.`food` (
                                 `id` INT NOT NULL AUTO_INCREMENT,
                                 `name` VARCHAR(45) NULL,
                                 `pick_count` INT NULL DEFAULT 0,
                                 `img_path` VARCHAR(45) NULL,
                                 PRIMARY KEY (`id`));


insert into food(name, img_path) values('bulgogi','/image/bulgogi.png');
insert into food(name, img_path) values('dducbbokggi','/image/dducbbokggi.png');
insert into food(name, img_path) values('frychiken','/image/frychiken.png');
insert into food(name, img_path) values('jjajjang','/image/jjajjang.png');
insert into food(name, img_path) values('pizza','/image/pizza.png');
insert into food(name, img_path) values('zzambbong','/image/zzambbong.png');