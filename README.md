Problem specijalnih popusta
Nama najdraža picerija Braško++ rešila je da uvede specijalan program akcija kako bi privukla što više mušterija.
Svaka 7. pizza u toku dana je gratis 3+1 gratis. Ako mušterija naruči4 pizze, poslednja se ne naplaćuje

Program dnevnih popusta, dat u tabeli
Id   Naziv        Cena
2    Capricciosa  320
3    Pepperoni    290
5    Vesuvio      310

Dan       Akcija
Utorak    10% Vesuvio
Četvrtak  10% Cappriciosa
Subota,
Nedelja   15% na sve pizze




Na početku programa radnik unosi koji je dan danas u formatu preciznije datom u ispisu. Ukoliko je radnik pogrešio pri unosu ispisati mu
grešku: Greška u unosu. Pokušajte ponovo: i omogućiti ispravku greške. Nakon toga program ulazi u mod uzimanja porudžbina
od individualnih mušterija. Radnik ne zna unapred koliko će mušterija biti, ali program omogućava unos specijalnog terminalnog znaka -
1 za izlzak iz rezima procesuiranja musterija. Svaka mušterija najpre kaže koliki broj pizza naručuje a onda zatim id-eve individualnih
pizza.

Dobrodošli u Braško++ pametnu kasu!
Koji je danas dan (Pon/Uto/Sre/Čet/Pet/Sub/Ned): (String)
Mušterija id#1: (int) (int) ...
Mušterija id#2: (int) (int) ...
...
Mušterija id#?: (int) (int) ...
Mušterija id#?: -1 //kraj programa

Primer unosa: Nastavak ispisa:

Uto
4 2 5 3 2
3 5 5 5
-1

Utorak
Mušterija 1: 4 pizze, Cappriciosa, Vesuvio, Peperoni, Cappriciosa
Mušterija 2: 3 pizze, Vesuvio, Vesuvio, Vesuvio

- Račun za mušteriju id#1 -
Pizza Capricciosa 320
Pizza Vesuvio 310
Pizza Pepperoni 290
AKCIJA 3+1 Cappriciosa 0
ukupno: 920
DNEVNA 10% Vesuvio -31
ukupno: 889
----------------------------
- Račun za mušteriju id#2 -
Pizza Vesuvio 310
Pizza Vesuvio 310
AKCIJA #7 Vesuvio 0
ukupno: 620
DNEVNA 10% Vesuvio -62
ukupno: 558
----------------------------

Primer unosa: Nastavak ispisa:

Sub
9 5 3 3 3 2 2 3 2 2
-1

Subota
Mušterija 1: 9 pizza, Vesuvio, Peperoni, Peperoni, Peperoni,
Capricciosa, Capricciosa, Pepperoni, Cappriciosa, Cappriciosa

- Račun za mušteriju id#1 -
Pizza Vesuvio 310
Pizza Pepperoni 290
Pizza Pepperoni 290
AKCIJA 3+1 Pepperoni 0
Pizza Capricciosa 320
Pizza Capricciosa 320
AKCIJA #7 Pepperoni 0
AKCIJA 3+1 Cappriciosa 0
Pizza Cappriciosa 320
ukupno: 1850
DNEVNA 15% SVE -278
ukupno: 1573
----------------------------

Sugestije:
Primetite da su identifikacioni brojevi prosti. Može biti od koristi pri računanju kombinovane dnevne akcije.
