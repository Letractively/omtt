
---

**Wiki is available only in Polish now. It will be translated before beta-release.**

---


## Czym jest OMTT? ##
**OMTT** jest językiem służącym do przekształcania danych o strukturze obiektowej do formatu tekstowego takiego, jak HTML, XML, JSON czy kod w innym języku programowania. Należy do klasy systemów szablonów, choć bardziej niż tradycyjne szablony będące dokumentami z lukami do uzupełnienia przypomina pełny język programowania. OMTT promuje podejście deklaratywne, jednocześnie kładąc nacisk na przejrzystość i elegancję tworzonego w nim kodu oraz udostępniając szereg narzędzi odpytywania modelu oraz manipulacji danymi.

Zamiast zapoznawać się ze szczegółowym opisem języka, możesz teraz chcieć zobaczyć:
  * [Przykłady kodu](CodeExamples.md)
  * [Rozwiązania alternatywne dla OMTT](Alternatives.md)
  * [Wskazówki, jak szybko zacząć pracę z OMTT](QuickStart.md)


## Spis treści ##



## Cechy języka ##
### Model obiektowy ###
W OMTT istnieją trzy rodzaje bytów: obiekty, sekwencje obiektów oraz funkcje.
  * Koncepcja **obiektów** jest uproszczeniem tej obecnej w klasycznym podejściu obiektowym. W OMTT obiekty przynależą do określonej klasy i posiadają atrybuty, których wartością mogą być inne obiekty lub ich sekwencje. Brak w nich natomiast metod i, co się z tym wiąże, możliwości zmiany stanu - po utworzeniu wartości wszystkich atrybutów pozostają bez zmian (w języku angielskim takie obiekty określane są jako _immutable_).
  * **Sekwencje obiektów** są uporządkowanymi zbiorami obiektów. W przeciwieństwie do modeli czysto obiektowych, nie są one obiektami, ale przyjmują cechy obiektów, które zawierają. Przykładowo sekwencja obiektów typu `Pracownik` posiadających atrybut `zarobki` dziedziczy atrybut `zarobki` będący sekwencją zarobków swoich elementów.
  * **Funkcje** w OMTT nie mają żadnych efektów ubocznych a ich wartość zależy wyłącznie od argumentów. **Szablony** są w tym ujęciu szczególnym, najpopularniejszym przypadkiem funkcji zwracających tekst.

### Składnia przyjazna XML-owi ###
W procesie tworzenia i utrzymywania szablonów, w których mieszają się dwa języki programowania, szczególnie istotna jest ich przejrzystość i zwięzłość. Popularną taktyką systemów szablonów jest wprowadzanie własnych tagów (np. JSP), filtrów modyfikujących wartości (np. Django) oraz instrukcji sterujących zagnieżdżonych w tekście (niemal wszystkie języki). W OMTT elementy te zostały wprowadzone na poziomie składni - jako lukier syntaktyczny dla istniejących, tradycyjnych konstrukcji.

Przykładowo poniższy tag:
```
% tag name="simple"
  content
% end
```
jest równoważny wywołaniu funkcji (szablonu) `tag` z zawartością przekazaną jako pierwszy argument i parametrami jako kolejne:
```
  {= tag "content" name="simple" }
```

Filtry działają na podobnej zasadzie: ich nazwa wskazuje funkcję a wartość poddawana filtracji przekazywana jest jako pierwszy argument. Przykładowo wywołanie
```
  {= "some string" | uppercase }
```
jest równoważne
```
  {= uppercase "some string" }
```

Filtry mogą przyjmować parametry oraz układać się w ciągi, na zasadzie podobnej do potoków w powłoce uniksowej. Poniższy ciąg filtrowań:
```
  {= "some string" | substring 3 | uppercase }
```
semantycznie nie różni się niczym od
```
  {= uppercase (substring "some string" 3) }
```

W ten sposób tworzenie własnych tagów i filtrów jest bardzo łatwe - sprowadza się do deklaracji zwykłych szablonów. Co więcej, wyłącznie od twórcy szablonów i przyjętych przez niego konwencji zależy, w jakich miejscach traktować funkcje jako tagi, a w jakich jako filtry lub zwykłe funkcje.

#### Zobacz też ####
  * [Przykłady użycia tagów](TagExamples.md)
  * [Przykłady użycia filtrów](FilterExamples.md)


### Podejście deklaratywne ###

Jedną z podstawowych idei OMTT jest dostarczenie metod deklaratywnego opisu przekształceń - tak aby twórca szablonów instruował, w jaki sposób przekształcać poszczególne klasy obiektów zamiast opisywać dokument wynikowy. W ten sposób wybór przekształceń i rezultat końcowy zależy od rodzaju danych wejściowych. Takie podejście stosowane jest między innymi w _XSLT_ dla przekształceń dokumentów XML.

Spójrzmy na poniższe definicje szablonu `business_card`:
```
  % def business_card [Employee]
    <h3>Employee business card</h3>
    Name: {=name} {=surname}<br/>
    Department: {=department}<br/>
    Address: {=address | htmlize}<br/>
  % end

  % def business_card [Department]
    <h3>Department</h3>
    Name: {=name}<br/>
    Number of employees: {=count employees}<br/>
    List of employees:
      {=employees | html::list}
  % end
```

Szablon `business_card` jest w tym przypadku _polimorficzny_: obiekt `Employee` zostanie przez niego przekształcony w inny sposób niż `Department` a decyzja zostanie podjęta w trakcie faktycznego wywołania szablonu na podstawie rzeczywistego a nie deklarowanego typu obiektu - to tak zwane _dynamic dispatch_. Możliwe jest również rozróżnianie obiektów ze względu na atrybuty:
```
  % def business_card [Employee where salary > 10000]
    Big shot...
  % end
```

#### Zobacz też ####
  * [Inny prosty przykład użycia szablonów polimorficznych](DeclarativeExample.md)

### Całkowity brak efektów ubocznych ###

Przekształcenia OMTT nie pociągają za sobą jakichkolwiek efektów ubocznych. W języku brak elementów imperatywnych - metody obiektów przekazywanych do transformacji są ukrywane, nie ma możliwości definiowania zmiennych ani typowych pętli. Celem takiego rozwiązania jest między innymi odseparowanie logiki biznesowej od widoku opartego na OMTT i zapewnienie, że przekazany model nigdy nie ulegnie modyfikacji.

### Narzędzia odpytywania modelu oraz manipulacji danymi ###

OMTT pozwala na odpytywanie modelu w sposób podobny do _SQL_ oraz _XPath_. Poniższe wyrażenia zwrócą sekwencję kierowników w dziale (lub działach) IT, którzy posiadają zespół liczący co najmniej 10 osób:
```
  departmens[name == 'IT'].employees.Manager[count team.employees >= 10]
```
lub równoważnie:
```
  (departments where name == 'IT').employees.Manager where count team.employees >= 10
```

Uzyskana sekwencja może być później łatwo przekształcana element po elemencie przy pomocy wyrażenia (poprzez słowo kluczowe `map`) lub przekazana funkcji filtrującej (poprzez operator `|` lub równoważny jemu `apply`):
```
  departmens[name == 'IT'].employees.Manager[count team.employees >= 10]
  map
    "<b>{=name} {=surname}</b> who directs {=team}"
  apply
    html::list
```

Pewnym ograniczeniem w stosunku do języków zapytań baz danych jest brak złączeń. Należy jednak odnotować, że powstał [pomysł ich wprowadzenia w kolejnych wersjach](FutureIdeas.md) wraz z rekordami.

### Statyczne, silne typowanie z inferencją typów ###

Znakomita większość języków szablonów jest typowana dynamicznie. Ma ono niekwestionowane zalety: jest wygodniejsze, tworzony kod bardziej zwięzły i mniej wrażliwy na modyfikacje modelu a język łatwiejszy do opanowania. W OMTT przyjęte zostało jednak typowanie statyczne, przede wszystkim z uwagi na istotny wpływ typów na przepływ sterowania (patrz akapit _podejście deklaratywne_). Twórca szablonu powinien wiedzieć, jakiego rodzaju obiekty będzie on przekształcał a jasna deklaracja niewątpliwie zwiększa późniejszą czytelność. Plusów tego rozwiązania jest jednak więcej:

  * środowisko programistyczne może zaoferować większą pomoc - zwłaszcza w dostępie do atrybutów obiektów, dzięki czemu energia poświęcona na zadeklarowanie typu może zwrócić się z nawiązką,
  * znaczna część potencjalnych błędów zostanie wykryta podczas kompilacji,
  * w bardzo dużych projektach znaczenie może mieć większa szybkość działania.

Aby zminimalizować niewygody statycznego typowania, OMTT wyposażone zostało w _inferencję typów_: kompilator stara się samodzielnie wywnioskować właściwy typ opierając się na kontekście. W wielu typowych przypadkach, na przykład w operacji przypisania, jawna deklaracja typu jest dzięki temu zupełnie zbędna.

W OMTT brak typowej konwersji typów, która została zastąpiona operacją wyboru wszystkich elementów danego typu.
```
  variable.Employee
```
zwróci:
  * gdy `variable` jest sekwencją - sekwencję wszystkich elementów zgodnych z typem `Employee`
  * gdy `variable` jest obiektem oraz jest zgodne z `Employee` - z powrotem `variable`
  * `null` w pozostałych przypadkach (w szczególności gdy `variable` nie dziedziczy po `Employee`)

### Na dokładkę... ###
OMTT ma jeszcze kilka interesujących choć mniej kluczowych cech.

#### Modularność ####
Szablony mogą być grupowane w moduły. Każdy moduł posiada własną przestrzeń nazw wraz możliwością importu innych modułów i definiowania szablonów widzianych lokalnie. To rozwiązanie stworzone jest przede wszystkim z myślą o łatwym rozprowadzaniu szablonów w postaci bibliotek.

Szablony polimorficzne mogą być składane z definicji z więcej niż jednego modułu bazowego oraz rozszerzane w modułach potomnych.

#### Funkcje wyższych rzędów ####
Funkcje mogą przyjmować jako argumenty zarówno obiekty i sekwencje obiektów, jak i inne funkcje. Ta przyjemna własność może być przydatna wszędzie tam, gdzie niewystarczający okaże się operator `map`. Co więcej, wyrażaniu funkcji anonimowych dedykowana jest zwięzła składnia. Dla przykładu poniżej zdefiniowana jest funkcja dodająca do siebie dwie liczby (uwaga dotycząca mechanizmu inferencji typów: kompilator w tym szczególnym przypadku przyjmie, że oba argumenty są liczbami całkowitymi, choć wystarczyłoby założenie, że są liczbami rzeczywistymi):
```
  (x y -> x + y)
```

#### Argumenty opcjonalne ####
Niektóre argumenty funkcji mogą być zadeklarowane jako opcjonalne. Wtedy ich podanie podczas wywołania funkcji nie będzie konieczne a kompilator przyjmie jako ich wartość `null`. Argumenty opcjonalne, podobnie do tagów i filtrów, istnieją jedynie na poziomie składni - w przypadku argumentów obligatoryjnych również możliwe jest przekazanie pustej wartości, ale musi być to wyrażone explicite. Ich zadaniem jest umożliwienie tworzenia tagów o naturze identycznej do tagów XML-owych, w których lista opcjonalnych argumentów często bywa imponująca ale dużo rzadziej jest wykorzystywana w pełni.

## Cechy implementacji ##
### Integracja z platformą Javy ###
Obecna implementacja OMTT integruje się z platformą Javy. Szablony operują na obecnych w maszynie wirtualnej klasach, w pełni wspierając javovy model obiektowy - w szczególności dziedziczenie oraz interfejsy (zobacz: [korzystanie z klas Javy](ClassImport.md)).

Poszczególne moduły OMTT kompilowane są do klas Javy a zadeklarowane w nich funkcje - do publicznych metod statycznych. Z punktu widzenia maszyny wirtualnej i programisty, niewiele różnią się od kodu napisanego w czystej Javie! Upraszcza to wiele operacji:
  * uruchamienie transformacji sprowadza się do wywołania metody odpowiedniej klasy,
  * nie ma konieczności konfigurowania czegokolwiek,
  * pisanie zewnętrznych bibliotek dla OMTT jest bardzo łatwe,
  * możliwe jest rozprowadzanie szablonów w postaci skompilowanej w zwykłych paczkach JAR,
  * aby skorzystać w szablonach z zewnętrznych bibliotek dla OMTT, wystarczy załadować do maszyny wirtualnej zawierającą je paczkę JAR.

Co więcej, nic nie stoi na przeszkodzie współpracy OMTT z innymi poza Javą językami obecnymi na JVM: Scalą, Groovim, JPythonem czy JRubim.

### Tworzenie własnych bibliotek w Javie ###
Pomimo sporych możliwości OMTT, w trakcie projektowania szablonów może zajść potrzeba skorzystania z imperatywnych konstrukcji języka - na przykład dostępu do metod, wykonania operacji na tablicach lub wczytania pliku. W takiej sytuacji możliwe jest zaimplementowanie w prosty sposób odpowiedniego modułu w innym języku JVM (na przykład w Javie).

_Uwaga:_ możliwości tej należy używać bardzo rozważnie. W szczególności implementowane metody _nie mogą_ w żaden sposób zmieniać modelu; OMTT _nie gwarantuje_ przy tym podstawowych własności imperatywnych, w tym kolejności wywoływaniu funkcji czy gorliwego obliczania ich za każdym razem. Należy przyjąć, że bezpieczne są wyłącznie funkcje zależne jedynie od swoich argumentów i nie zmieniające w żaden sposób stanu.

Poniższy przykład ilustruje implementację funkcji `applyNumbers` wewnątrz modułu `pl.omtt.samples.jlib`:
```
package templates.pl.omtt.samples;
// necessary imports

@OmttModule
public class Jlib {
  public static List<Integer> applyNumbers (Function1<Integer,Integer> f) {
    List<Integer> result = new ArrayList<Integer>();
    for(int i = 1; i <= 100; i++)
      result.add(f.run(i));
    return result;
  }
}
```
Może być ona później użyta w szablonie w całkowicie naturalny sposób. Na przykład dla otrzymania sekwencji liczb parzystych od 2 do 200:
```
  applyNumbers (x -> x * 2)
```

Warto zaznaczyć, że powyższy przykład może być równie łatwo wyrażony w samym OMTT (w dodatku nieco ogólniej, ponieważ f otrzyma typ `(Int → α) → α*`):
```
%% module pl.omtt.samples.jlib

% def applyNumbers f:
  1..100 apply f
% end
```

### Rozprowadzanie bibliotek ###
Kwestia wygodnej dystrybucji bibliotek szablonów została już zasygnalizowana we wstępie, zasługuje jednak na szersze potraktowanie.

W aplikacjach WWW warstwa widoku jest istotnym elementem całości. Pomimo to podczas gdy biblioteki dla języków ogólnych są powszechne, te dedykowane szablonom stanowią raczej luksus. Zazwyczaj przyjmują one postać zestawów tagów, których implementacja odbywa się w nieprzystosowanym do generowania tekstu języku ogólnym oraz dodatkowych plików konfiguracyjnych. Próba zmiany tej sytuacji jest jednym z najważniejszych celów OMTT. Trudno nie docenić potencjalnych korzyści:
  * łatwość implementacji bibliotek szablonów drastycznie zwiększa atrakcyjność dostępność tego rozwiązania,
  * możliwe jest tworzenie interfejsu dla wspólnych elementów serwisu (np. kontrolek, układów stron) dla wykorzystania w rozszerzeniach,
  * biblioteki wdgetów webowych (np. YUI) mogą publikować wygodne API,
  * realna staje się budowa rozszerzeń dla - jednocześnie - kontrolera i widoku.

W OMTT każdy skompilowany zestaw modułów może być rozprowadzany jako biblioteka w taki sam sposób, jak zwykłe klasy napisane w Javie (np. w postaci paczki JAR). Co więcej, nic nie stoi na przeszkodzie umieszczenia w jednej paczce zarówno szablonów, jak i klas przeznaczonych do użycia w pozostałych warstwach (np. w kontrolerze). Moduły z zewnętrznych bibliotek stają się dostępne wraz z umieszczeniem ich w maszynie wirtualnej. Trudno wyobrazić sobie prostsze rozwiązanie.

### Środowisko deweloperskie dla Eclipse ###
Równolegle z rozwojem języka, powstało środowisko deweloperskie dla Eclipse dostarczające podstawowych narzędzi potrzebnych do projektowania szablonów. W jego skład wchodzą:
  * builder przyrostowy, który na bieżąco poddaje kompilacji te moduły, które zostały dotknięte przez zmiany,
  * kolorowanie składni,
  * podświetlanie błędów i ostrzeżeń,
  * zwijanie kodu,
  * wyświetlanie struktury modułu.
<br>
<img src='http://omtt.googlecode.com/svn/wiki/images/screenshot-ide.jpeg' />