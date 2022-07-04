CREATE TABLE `testdb`.`food` (
                                 `id` INT NOT NULL AUTO_INCREMENT,
                                 `name` VARCHAR(45) NULL,
                                 `pick_count` INT NULL DEFAULT 0,
                                 `path` VARCHAR(45) NULL,
                                 PRIMARY KEY (`id`));


insert into food(name, path) values('bulgogi','/image/bulgogi.png');
insert into food(name, path) values('dducbbokggi','/image/dducbbokggi.png');
insert into food(name, path) values('frychiken','/image/frychiken.png');
insert into food(name, path) values('jjajjang','/image/jjajjang.png');
insert into food(name, path) values('pizza','/image/pizza.png');
insert into food(name, path) values('zzambbong','/image/zzambbong.png');