INSERT INTO public.country(id, name) VALUES (1, 'FRANCE');
INSERT INTO public.country(id, name) VALUES (2, 'GERMANY');
INSERT INTO public.country(id, name) VALUES (3, 'ENGLAND');
INSERT INTO public.country(id, name) VALUES (4, 'CHINA');
INSERT INTO public.country(id, name) VALUES (5, 'JAPAN');

INSERT INTO public.address(id, building, city, street, zip, country_id)	VALUES (1, 'Nymar', 'Paris', '38 Av', 75, 1);
INSERT INTO public.address(id, building, city, street, zip, country_id)	VALUES (2, 'Harry', 'Paris', '39 Av', 75, 2);
INSERT INTO public.address(id, building, city, street, zip, country_id)	VALUES (3, 'Ronaldo', 'Paris', '49 Av', 75, 1);
INSERT INTO public.address(id, building, city, street, zip, country_id)	VALUES (4, 'Nadal', 'Paris', '40 Av', 75, 4);
INSERT INTO public.address(id, building, city, street, zip, country_id)	VALUES (5, 'KING', 'Paris', '50 Av', 75, 2);

INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (1, 'Laptop', 'test', 5, 1);
INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (2, 'Desktop', 'test', 6, 1);
INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (3, 'Headphone', 'test', 6, 2);
INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (4, 'phoneear', 'test', 6, 3);
INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (5, 'TabltopGang', 'test', 7, 3);
INSERT INTO public.product(_id, description, image_url, price, address_id) VALUES (6, 'LaptopIBM', 'test', 8, 4);