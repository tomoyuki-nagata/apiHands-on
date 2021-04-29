-- public.todo definition

-- Drop table

-- DROP TABLE public.todo;

CREATE TABLE public.todo (
    id serial NOT NULL,
    title varchar NOT NULL,
    deadline date NOT NULL,
    note text NOT NULL,
    completed bool NOT NULL,
    created_at timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO public.todo
    (title, deadline, note, completed)
VALUES
    ('sample', '2021-04-01', 'sample', false);
