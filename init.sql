CREATE TABLE uzer(
uzer_id SERIAL,
uzer_name text NOT NULL,
uzer_password text NOT NULL,
CONSTRAINT uzer_pk PRIMARY KEY (uzer_id)
);

CREATE TABLE tag(
tag_id SERIAL,
tag_name text NOT NULL,
CONSTRAINT tag_pk PRIMARY KEY (tag_id)
);

CREATE TABLE post(
post_id SERIAL,
post_name text NOT NULL,
post_content text NOT NULL,
post_date date NOT NULL,
post_state INTEGER NOT NULL,
post_image BLOB,
post_uzer_id INTEGER NOT NULL REFERENCES uzer (uzer_id),
CONSTRAINT post_pk PRIMARY KEY (post_id)
);


CREATE TABLE comment(
comment_id SERIAL,
comment_post_id INTEGER NOT NULL REFERENCES post (post_id),
comment_date date NOT NULL,
comment_author text NOT NULL,
comment_content text NOT NULL,
CONSTRAINT comment_pk PRIMARY KEY (comment_id) 
);

CREATE TABLE pog(
pog_id SERIAL,
pog_post_id INTEGER NOT NULL REFERENCES post (post_id),
pog_tag_id INTEGER NOT NULL REFERENCES tag (tag_id),
CONSTRAINT pog_pk PRIMARY KEY (pog_id)
);

CREATE SEQUENCE public.hibernate_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
