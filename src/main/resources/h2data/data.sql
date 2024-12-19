INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (0, 'HORROR', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (1, 'ROMANCE', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (2, 'SCI-FI', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (3, 'MANGA', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (4, 'GRAPHIC NOVEL', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (5, 'NON FICTION', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (6, 'THRILLER', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (7, 'FANTASY', '');
INSERT INTO "GENRE" ("ID", "NAME", "DESCRIPTION") VALUES (8, 'CHILDRENS', '');

INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (0, 'Jujutsu Kaisen 0', 'Gege', 'Akutami', 'Norma Comics');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (1, 'Jujutsu Kaisen 1', 'Gege', 'Akutami', 'Norma Comics');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (2, 'IT', 'Stephen', 'King', 'Debolsillo');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (3, 'Silmarillion', 'J.R.R', 'Tolkien', 'Minotauro');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (4, 'The Hobbit', 'J.R.R', 'Tolkien', 'Minotauro');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (5, 'The Lord of the Rings', 'J.R.R', 'Tolkien', 'Minotauro');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (6, 'Robot', 'Adam', 'Wisniewski-Snerg', 'Penguin');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (7, 'The Wild Robot', 'Peter', 'Brown', 'Bonnier Books');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (8, 'Normal People', 'Sally', 'Roonie', 'Faber & Faber Ltd');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (9, 'Alley', 'Junji', 'Ito', 'Viz LLC');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (10, 'Deserter', 'Junji', 'Ito', 'Viz LLC');
INSERT INTO book(id, name, author_name, author_surname, editorial)
    VALUES (11, 'The Light of the Fireflies', 'Paul', 'Pen', 'Amazon Crossing');

INSERT INTO book_genres (book_id, genre_id) VALUES (0, 3);
INSERT INTO book_genres (book_id, genre_id) VALUES (1, 3);
INSERT INTO book_genres (book_id, genre_id) VALUES (2, 0);
INSERT INTO book_genres (book_id, genre_id) VALUES (2, 6);
INSERT INTO book_genres (book_id, genre_id) VALUES (3, 7);
INSERT INTO book_genres (book_id, genre_id) VALUES (4, 7);
INSERT INTO book_genres (book_id, genre_id) VALUES (5, 7);
INSERT INTO book_genres (book_id, genre_id) VALUES (6, 2);
INSERT INTO book_genres (book_id, genre_id) VALUES (7, 8);
INSERT INTO book_genres (book_id, genre_id) VALUES (7, 7);
INSERT INTO book_genres (book_id, genre_id) VALUES (8, 1);
INSERT INTO book_genres (book_id, genre_id) VALUES (8, 7);
INSERT INTO book_genres (book_id, genre_id) VALUES (9, 0);
INSERT INTO book_genres (book_id, genre_id) VALUES (9, 3);
INSERT INTO book_genres (book_id, genre_id) VALUES (9, 4);
INSERT INTO book_genres (book_id, genre_id) VALUES (9, 2);
INSERT INTO book_genres (book_id, genre_id) VALUES (10, 0);
INSERT INTO book_genres (book_id, genre_id) VALUES (10, 3);
INSERT INTO book_genres (book_id, genre_id) VALUES (10, 4);
INSERT INTO book_genres (book_id, genre_id) VALUES (10, 2);
INSERT INTO book_genres (book_id, genre_id) VALUES (11, 0);
INSERT INTO book_genres (book_id, genre_id) VALUES (11, 6);
