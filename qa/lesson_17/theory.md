## Web protocols

Модель клиент-сервер используется при построении системы обработки информации на основе СУБД, а также почтовые системы

- HTTP Hyper Text Transfer Protocol

- HTTPs Hyper Text Transfer Protocol secured - Данные передаются в засекреченном виде

- SSL/TLS -  протокол шифрования данных

- Public/Privat Key  - подпись цифровым сертификатом

- FTP File Transfer Protocol

- POP3 SMTP - почтовые протоколы для отправки и получение писем (POP3 - протокол для входящей почты; SMTP - для исходящей почты)

- IMAP - почтовые протоколы для отправки

- UDP User Datagram Protocol - данные уходят набором данных

#### Request (запрос)
клиента к серверу

- Base Line/ Start line: *method*; URI; protocol

  *method* - что хотим сделать?

  URI где мы это хотим сделать

#### Reponse (ответ)
от сервера клиенту

*Status code* standard

- HEADERS:
  param1: atr1,atr2,atr3
  Content-type: image
  cookeis:
  last-modified: 14.01.2021 15:49:10 GMT

- BODY

#### Status code

1хх Info (101 switching protocols)

2хх Success (200 OK)

3хх Redirect (304 Not Modified)

4хх Client error (404 Not Found)

5хх Server error (500 Internal server error)

#### Methods

GET - получение ресурса

POST - создание ресурса

PUT - обновление ресурса

DELETE - удаление ресурса

[Презентация](https://docs.google.com/presentation/d/15qWmTQ3nE_SShPUHDi08SH_RIFWvw56B/edit?usp=sharing&ouid=100462493827587974016&rtpof=true&sd=true)

[Документация Postman](https://learning.postman.com/docs/introduction/overview/)

Kоллекция QA24 ilCarro https://api.postman.com/collections/8263422-ad116dc6-0c84-472a-9432-f167f0aabe9b?access_key=PMAT-01H5JJ794X9D5SWP3VRJGYNRYP

команда для запуска из cmd и Jenkins

newman run <collection_link> -e <environment_path>

команда для раскодировки в Jenkins

java **-Dfile.encoding=UTF-8** -jar jenkins.war