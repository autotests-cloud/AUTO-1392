# Проект по автоматизации тестирования для Miro

## :scroll: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#scroll-реализованные-проверки)
- [Сборка в Jenkins](#-jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#-примеры-видео-о-прохождении-тестов)

## :rocket: Технологии и инструменты

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="external/logos/Intelij_IDEA.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="external/logos/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="external/logos/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="external/logos/Selenide.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="external/logos/Gradle.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="external/logos/Allure.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="external/logos/Jenkins.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="external/logos/Selenoid.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="external/logos/GitHub.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="external/logos/Telegram.svg" width="50"/></a>
</div>

## :scroll: Реализованные-проверки

- :heavy_check_mark: Проверка смены языка.
- :heavy_check_mark: Проверка наличия вакансий по запросу QA и Java.
- :heavy_check_mark: Проверка отображения вакансий выбранного города при клике на иконку столицы.
- :heavy_check_mark: Проверка наличия логотипа при смене языка.
- :heavy_check_mark: Проверка, что страница меняет свое названия при смене языка.
- :x: Пример упавшего теста.

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/miro-e2e-tests-jenkins/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/miro-e2e-tests-jenkins/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

* BrowserName (браузер, по умолчанию chrome)
* BrowserVrersion (версия браузера, по умолчанию 91.0)
* BrowserSise (размер окна браузера, по умолчанию 1920x1080)
* BrowserMobile (название мобильного устройства, для примера iPhone X)
* remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
* videoStorage (адрес, по которому можно получить видео)

### :computer: Запуск тестов из терминала

```bash
gradle clean test
```

### :robot: Удаленный запуск:

```bash
clean
test
-DremoteUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub
-Dbrowser_name=${BROWSER_NAME}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/miro-e2e-tests-jenkins/45/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>


## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video2.gif" width="250" height="153"  alt="video"> 
</p>