## Instalacja ##

Ponieważ OMTT jest obecnie rozprowadzany wraz ze środowiskiem deweloperskim dla Eclipse, najprostszym sposobem instalacji jest skorzystanie z opcji **Find and install new software** w Eclipse a następnie wybranie repozytorium (_update site_) pod adresem:

> http://omtt.googlecode.com/svn/trunk/update-site/

Wymagany jest Eclipse w wersji przynajmniej 3.4 (Ganymede lub Galileo).

> ![http://omtt.googlecode.com/svn/wiki/images/screenshot-update-site.jpeg](http://omtt.googlecode.com/svn/wiki/images/screenshot-update-site.jpeg)

## Konfiguracja projektu do pracy z OMTT ##
Aby skonfigurować projekt Javy (to ważne!) do pracy z OMTT należy w **Package explorerze** otworzyć menu kontekstowe projektu a następnie wybrać **Configure → Add OMTT support**. Wtyczka doda do projektu niezbędne biblioteki oraz katalog _templates_ przeznaczony do przechowywania plików OMTT.

> ![http://omtt.googlecode.com/svn/wiki/images/post-install-package.jpg](http://omtt.googlecode.com/svn/wiki/images/post-install-package.jpg)

W tym momencie środowisko jest gotowe do pracy. Wszystkie pliki z rozszerzeniem **omtt** zostaną otwarte w dedykowanym edytorze a ich zapis uruchomi automatyczną kompilację.

_Uwaga:_ builder OMTT działa w sposób przyrostowy, co oznacza, że kompilacji poddawane są jedynie te źródła, które uległy zmianie.

## Co dalej? ##
Najlepszym pierwszym krokiem po konfiguracji środowiska jest przetestowanie kilku [przykładowych szablonów](CodeExamples.md).