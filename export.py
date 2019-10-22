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
                               'urlProject': 'http://notabenoid.org/book/77921/',
                               'chapterName': file,
                               'chapterPlacement': 1,
                               'chapterStatus': 0,
                               'fileFormat': 2,
                               'userName': LOGIN,
                               'userPassword': PASSWORD,
                               'isAgree': 'on',
                               'btnSubmit': 'Создать'
                           })
    if answer.status_code != 200:
        print(file)
        print(answer.status_code)
        print(bytes.decode(answer.content))



files = []

for r, d, f in os.walk('en/'):
    for file in f:
        files.append(int(file[:-4]))

files.sort()

for f in files:
    print(f)
    create_chapter(str(f) + ".tex")
