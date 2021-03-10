# Migrated

This project migrated to https://github.com/deadman2000/sci_tools

## Инструментарий для перевода игры Conquests of the Longbow

**SCI_Lib** - библиотека для работы с форматом SCI. 
Содержит классы для работы с игровыми ресурсами и переводом.

**SCI_Tools** - набор программ для различных задач (экспорт скриптов, текстов, переводов и пр.).

**SCI_Translator** - десктоп приложение для просмотра ресурсов и перевода.
Путь к игре задается первым аргументом командной строки*.
Есть редактор шрифтов, просмотр скриптов и текстов, поисковик.

**Notabenoid** - утилита загрузки текстовых ресурсов на http://notabenoid.org.
Параметры запуска: `Notabenoid.exe <логин> <пароль> <путь к игре>`*.

**Notabenoid_Patch** - утилита для патча игры переводом с http://notabenoid.org
Параметры запуска: `Notabenoid_Patch.exe <логин> <пароль> <путь к игре>`*.
Логин, пароль и путь к игре можно задать через переменные окружения `NN_LOGIN`, `NN_PASSWORD` и `GAME_DIR` соответственно.

**RobinHoodWeb** - веб-сайт для патча игры с notabenoid. Переменные окружения аналогичные.

**Dockerfile** - докер образ вебки.

**deployment.yml** - развертка в Kubernetes с traefik.

*Переведенная игра должна лежать в папке `TRANSLATE`.

## Полезные ссылки

http://wiki.scummvm.org/index.php/SCI/Specifications

https://conquests.fandom.com/wiki/Conquests_Omnipedia
