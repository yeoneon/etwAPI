drop table if exists food;
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

insert into food(name, img_path) values('beefribstew','/image/beefribstew.png');
insert into food(name, img_path) values('bossam','/image/bossam.png');
insert into food(name, img_path) values('carbonara','/image/carbonara.png');
insert into food(name, img_path) values('curryrice','/image/curryrice.png');
insert into food(name, img_path) values('doenjangjjigae','/image/doenjangjjigae.png');
insert into food(name, img_path) values('hamburger','/image/hamburger.png');

insert into food(name, img_path) values('kimchijjigae','/image/kimchijjigae.png');
insert into food(name, img_path) values('lampribs','/image/lampribs.png');
insert into food(name, img_path) values('lapmskwers','/image/lapmskwers.png');
insert into food(name, img_path) values('pigfoot','/image/pigfoot.png');
insert into food(name, img_path) values('piggugbab','/image/piggugbab.png');
insert into food(name, img_path) values('porkbelly','/image/porkbelly.png');

insert into food(name, img_path) values('porkrib','/image/porkrib.png');
insert into food(name, img_path) values('ramen','/image/ramen.png');
insert into food(name, img_path) values('rawmeat','/image/rawmeat.png');
insert into food(name, img_path) values('rawsalmon','/image/rawsalmon.png');
insert into food(name, img_path) values('salad','/image/salad.png');
insert into food(name, img_path) values('samgyetang','/image/samgyetang.png');

insert into food(name, img_path) values('sundae','/image/sundae.png');
insert into food(name, img_path) values('sundaegugbab','/image/sundaegugbab.png');
insert into food(name, img_path) values('sushi','/image/sushi.png');
insert into food(name, img_path) values('sweetandsourpork','/image/sweetandsourpork.png');
insert into food(name, img_path) values('tendon','/image/tendon.png');
insert into food(name, img_path) values('tomatospagetti','/image/tomatospagetti.png');

insert into food(name, img_path) values('tonkatsu','/image/tonkatsu.png');
insert into food(name, img_path) values('udon','/image/udon.png');