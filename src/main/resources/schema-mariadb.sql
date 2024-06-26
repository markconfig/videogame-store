drop table if exists videogame;
drop table if exists supplier;
drop table if exists developer;

create table videogame (
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    url_image varchar(500)
);


insert into videogame
(name,                    description,                                                                                                                                                                    url_image) values
('Bioshock Infinite',       'La última gran entrega de la saga Bioshock, ahora en una imperdible ciudad de ensueño entre las nubes.',                                                                       'https://cdn.vox-cdn.com/thumbor/I24jyQjEEDBM4AQrGIbaCk4t2gk=/0x0:1080x720/1200x800/filters:focal(0x0:1080x720)/cdn.vox-cdn.com/uploads/chorus_image/image/4674397/bioshock_infinite_delay.0.jpg'),
('Insurgency: Sandstorm',   'Un FPS táctico por equipos basado en combates letales en espacios reducidos y multijugador centrado en objetivos',                                                             'https://areajugones.sport.es/wp-content/uploads/2018/06/insurgency-e1528802800327.jpg'),
('The Witness',             'Te despiertas, a solas, en una extraña isla llena de puzles que te retarán y sorprenderán.',                                                                                   'https://cdn.wccftech.com/wp-content/uploads/2016/11/the-witness-ps4-pro-patch-4k-2060x1288.jpg'),
('Braid',                   'Un juego de rompecabezas con toques plataformeros, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas.',                                          'https://upload.wikimedia.org/wikipedia/en/6/6a/Braidlogo.jpg'),
('Borderlands 3',           '¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!',                                                                                   'https://th.bing.com/th/id/R.fee610d5da5fd2cc06fa7b76b764a103?rik=wpv7177pg94n4w&pid=ImgRaw&r=0'),
('Control',                 'Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.',  'https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$'),
('Subnautica',              'Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros!',                              'https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000'),
('Firewatch',               'Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming',                                                                'https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg');


create table supplier (
    id int primary key auto_increment,
    name varchar(200) not null,
    web_site varchar(500)
);

insert into supplier
(id,    name,                         web_site) values
(1,     '2K',                           'https://2k.com'),
(2,     'Focus Home Interactive',       'https://www.focus-home.com'),
(3,     'Thekla',                       null),
(4,     'Number One',                   null),
(5,     '505 Games',                    'https://505games.com'),
(6,     'Unknown Worlds Entertainment', 'https://unknownworlds.com'),
(7,     'Campo Santo',                  'https://www.camposanto.com');

alter table videogame
add column supplier_id int,
add foreign key (supplier_id) references supplier(id);

update videogame set supplier_id = 1 where id in (1, 5);
update videogame set supplier_id = 2 where id in (2);
update videogame set supplier_id = 3 where id in (3);
update videogame set supplier_id = 4 where id in (4);
update videogame set supplier_id = 5 where id in (6);
update videogame set supplier_id = 6 where id in (7);
update videogame set supplier_id = 7 where id in (8);

alter table videogame
modify supplier_id int not null;



create table developer (
    id int primary key auto_increment,
    name varchar(200) not null,
    web_site varchar(500),
    user_name varchar(50) not null

);

insert into developer
(id,    name,                         web_site,                             user_name) values
(1,     'Marcos',                       'https://markconfig.github.io',      'Markconfig'),
(2,     'Orosco',                       'https://www.orosc.com',             'Oroscgie'),
(3,     'Capgemini',                    'https://wwwcapgemini.com',          'Capgemini'),
(4,     'Fermani',                       null,                               'Fermen'),
(5,     'Coutof',                        'https://coutof.com',               'Cougtq'),
(6,     'Whisman',                       'https://whism.com',                'Whitesman'),
(7,     'Orlanfind',                     'https://www.horfind.com',          'Thinkout');

alter table videogame
add column developer_id int,
add foreign key (developer_id) references developer(id);

update videogame set developer_id = 1 where id in (1, 5);
update videogame set developer_id = 2 where id in (2);
update videogame set developer_id = 3 where id in (3);
update videogame set developer_id = 4 where id in (4);
update videogame set developer_id = 5 where id in (6);
update videogame set developer_id = 6 where id in (7);
update videogame set developer_id = 7 where id in (8);

alter table videogame
modify developer_id int not null;
