# DimSpace Django Web Framework

## Requirements

- python3

		$ sudo apt install python3


- virtualenv

		$ sudo apt install python3-virtualenv
		$ virtualenv venv
		$ chmod 777 venv/bin/activate

## Run DimSpace Webapp

1. Enter virtualenv

        $ . venv/bin/activate

2. Install django requirements

		$ pip install -r requirements.txt

3. If you are accessing the webpage from the same machine you are running it on, you can launch the django app on local host:

		$ python3 manage.py runserver 8000

	Now the site should be accessible at http://localhost:8000

	If you are accessing the webpage from a different machine, launch the django app on the machines IP with:

		$ python3 manage.py runserver 0.0.0.0:8000
	
	This will make the webapp accessible via the machines IP. 

    E.g: http://SERVER.IP.HERE:8000


