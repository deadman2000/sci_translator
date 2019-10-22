import os
import requests

LOGIN = ''
PASSWORD = ''


def create_chapter(file):
    answer = requests.post('http://vayurik.ru/tools/notabenoid/create_chapter.php',
                           files={
                               'userFile': (file, open('en/' + file, 'rb'), 'application/octet-stream'),
                           },
                           data={
                               'urlProject': 'http://notabenoid.org/book/77918/',
                               'chapterName': file,
                               'chapterPlacement': 1,
                               'chapterStatus': 0,
                               'fileFormat': 1,
                               'userName': LOGIN,
                               'userPassword': PASSWORD,
                               'isAgree': 'on',
                               'btnSubmit': 'Создать'
                           })
    if answer.status_code != 200:
        print(file)
        print(answer.status_code)
        print(bytes.decode(answer.content))


for r, d, f in os.walk('en/'):
    for file in f:
        create_chapter(file)
