package Map;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adem KOCAMAZ
 */
public class Map {
//-------------------------------------------------------------    

    private State[] states;
//-------------------------------------------------------------

    public Map() {
        State ADANA = new State("ADANA");
        State ADIYAMAN = new State("ADIYAMAN");
        State AFYONKARAHISAR = new State("AFYONKARAHISAR");
        State AGRI = new State("AGRI");
        State AMASYA = new State("AMASYA");
        State ANKARA = new State("ANKARA");
        State ANTALYA = new State("ANTALYA");
        State ARTVIN = new State("ARTVIN");
        State AYDIN = new State("AYDIN");
        State BALIKESIR = new State("BALIKESIR");
        State BILECIK = new State("BILECIK");
        State BINGOL = new State("BINGOL");
        State BITLIS = new State("BITLIS");
        State BOLU = new State("BOLU");
        State BURDUR = new State("BURDUR");
        State BURSA = new State("BURSA");
        State CANAKKALE = new State("CANAKKALE");
        State CANKIRI = new State("CANKIRI");
        State CORUM = new State("CORUM");
        State DENIZLI = new State("DENIZLI");
        State DIYARBAKIR = new State("DIYARBAKIR");
        State EDIRNE = new State("EDIRNE");
        State ELAZIG = new State("ELAZIG");
        State ERZINCAN = new State("ERZINCAN");
        State ERZURUM = new State("ERZURUM");
        State ESKISEHIR = new State("ESKISEHIR");
        State GAZIANTEP = new State("GAZIANTEP");
        State GIRESUN = new State("GIRESUN");
        State GUMUSHANE = new State("GUMUSHANE");
        State HAKKARI = new State("HAKKARI");
        State HATAY = new State("HATAY");
        State ISPARTA = new State("ISPARTA");
        State MERSIN = new State("MERSIN");
        State ISTANBUL = new State("ISTANBUL");
        State IZMIR = new State("IZMIR");
        State KARS = new State("KARS");
        State KASTAMONU = new State("KASTAMONU");
        State KAYSERI = new State("KAYSERI");
        State KIRKLARELI = new State("KIRKLARELI");
        State KIRSEHIR = new State("KIRSEHIR");
        State KOCAELI = new State("KOCAELI");
        State KONYA = new State("KONYA");
        State KUTAHYA = new State("KUTAHYA");
        State MALATYA = new State("MALATYA");
        State MANISA = new State("MANISA");
        State KAHRAMANMARAS = new State("KAHRAMANMARAS");
        State MARDIN = new State("MARDIN");
        State MUGLA = new State("MUGLA");
        State MUS = new State("MUS");
        State NEVSEHIR = new State("NEVSEHIR");
        State NIGDE = new State("NIGDE");
        State ORDU = new State("ORDU");
        State RIZE = new State("RIZE");
        State SAKARYA = new State("SAKARYA");
        State SAMSUN = new State("SAMSUN");
        State SIIRT = new State("SIIRT");
        State SINOP = new State("SINOP");
        State SIVAS = new State("SIVAS");
        State TEKIRDAG = new State("TEKIRDAG");
        State TOKAT = new State("TOKAT");
        State TRABZON = new State("TRABZON");
        State TUNCELI = new State("TUNCELI");
        State SANLIURFA = new State("SANLIURFA");
        State USAK = new State("USAK");
        State VAN = new State("VAN");
        State YOZGAT = new State("YOZGAT");
        State ZONGULDAK = new State("ZONGULDAK");
        State AKSARAY = new State("AKSARAY");
        State BAYBURT = new State("BAYBURT");
        State KARAMAN = new State("KARAMAN");
        State KIRIKKALE = new State("KIRIKKALE");
        State BATMAN = new State("BATMAN");
        State SIRNAK = new State("SIRNAK");
        State BARTIN = new State("BARTIN");
        State ARDAHAN = new State("ARDAHAN");
        State IGDIR = new State("IGDIR");
        State YALOVA = new State("YALOVA");
        State KARABUK = new State("KARABUK");
        State KILIS = new State("KILIS");
        State OSMANIYE = new State("OSMANIYE");
        State DUZCE = new State("DUZCE");
//-------------------------------------------------------------
        ADANA.insertAdjacent(HATAY);
        ADANA.insertAdjacent(OSMANIYE);
        ADANA.insertAdjacent(KAHRAMANMARAS);
        ADANA.insertAdjacent(KAYSERI);
        ADANA.insertAdjacent(NIGDE);
        ADANA.insertAdjacent(MERSIN);
//-------------------------------------------------------------
        ADIYAMAN.insertAdjacent(SANLIURFA);
        ADIYAMAN.insertAdjacent(DIYARBAKIR);
        ADIYAMAN.insertAdjacent(MALATYA);
        ADIYAMAN.insertAdjacent(KAHRAMANMARAS);
        ADIYAMAN.insertAdjacent(GAZIANTEP);
//-------------------------------------------------------------
        AFYONKARAHISAR.insertAdjacent(ISPARTA);
        AFYONKARAHISAR.insertAdjacent(KONYA);
        AFYONKARAHISAR.insertAdjacent(ESKISEHIR);
        AFYONKARAHISAR.insertAdjacent(KUTAHYA);
        AFYONKARAHISAR.insertAdjacent(USAK);
        AFYONKARAHISAR.insertAdjacent(DENIZLI);
        AFYONKARAHISAR.insertAdjacent(BURDUR);
//-------------------------------------------------------------
        AGRI.insertAdjacent(VAN);
        AGRI.insertAdjacent(IGDIR);
        AGRI.insertAdjacent(KARS);
        AGRI.insertAdjacent(ERZURUM);
        AGRI.insertAdjacent(MUS);
        AGRI.insertAdjacent(BITLIS);
//-------------------------------------------------------------
        AMASYA.insertAdjacent(TOKAT);
        AMASYA.insertAdjacent(SAMSUN);
        AMASYA.insertAdjacent(CORUM);
//-------------------------------------------------------------
        ANKARA.insertAdjacent(AKSARAY);
        ANKARA.insertAdjacent(KIRSEHIR);
        ANKARA.insertAdjacent(KIRIKKALE);
        ANKARA.insertAdjacent(CANKIRI);
        ANKARA.insertAdjacent(BOLU);
        ANKARA.insertAdjacent(ESKISEHIR);
        ANKARA.insertAdjacent(KONYA);
//-------------------------------------------------------------
        ANTALYA.insertAdjacent(MERSIN);
        ANTALYA.insertAdjacent(KARAMAN);
        ANTALYA.insertAdjacent(KONYA);
        ANTALYA.insertAdjacent(ISPARTA);
        ANTALYA.insertAdjacent(BURDUR);
        ANTALYA.insertAdjacent(MUGLA);
//-------------------------------------------------------------
        ARTVIN.insertAdjacent(ERZURUM);
        ARTVIN.insertAdjacent(ARDAHAN);
        ARTVIN.insertAdjacent(RIZE);
//-------------------------------------------------------------
        AYDIN.insertAdjacent(MUGLA);
        AYDIN.insertAdjacent(DENIZLI);
        AYDIN.insertAdjacent(MANISA);
        AYDIN.insertAdjacent(IZMIR);
//-------------------------------------------------------------
        BALIKESIR.insertAdjacent(IZMIR);
        BALIKESIR.insertAdjacent(MANISA);
        BALIKESIR.insertAdjacent(KUTAHYA);
        BALIKESIR.insertAdjacent(BURSA);
        BALIKESIR.insertAdjacent(CANAKKALE);
//-------------------------------------------------------------
        BILECIK.insertAdjacent(KUTAHYA);
        BILECIK.insertAdjacent(ESKISEHIR);
        BILECIK.insertAdjacent(BOLU);
        BILECIK.insertAdjacent(SAKARYA);
        BILECIK.insertAdjacent(BURSA);
//-------------------------------------------------------------
        BINGOL.insertAdjacent(DIYARBAKIR);
        BINGOL.insertAdjacent(MUS);
        BINGOL.insertAdjacent(ERZURUM);
        BINGOL.insertAdjacent(ERZINCAN);
        BINGOL.insertAdjacent(TUNCELI);
        BINGOL.insertAdjacent(ELAZIG);
//-------------------------------------------------------------
        BITLIS.insertAdjacent(SIIRT);
        BITLIS.insertAdjacent(VAN);
        BITLIS.insertAdjacent(AGRI);
        BITLIS.insertAdjacent(MUS);
        BITLIS.insertAdjacent(BATMAN);
        BITLIS.insertAdjacent(SIRNAK);
//-------------------------------------------------------------
        BOLU.insertAdjacent(ANKARA);
        BOLU.insertAdjacent(CANKIRI);
        BOLU.insertAdjacent(KARABUK);
        BOLU.insertAdjacent(ZONGULDAK);
        BOLU.insertAdjacent(DUZCE);
        BOLU.insertAdjacent(SAKARYA);
        BOLU.insertAdjacent(BILECIK);
//-------------------------------------------------------------
        BURDUR.insertAdjacent(ANTALYA);
        BURDUR.insertAdjacent(ISPARTA);
        BURDUR.insertAdjacent(AFYONKARAHISAR);
        BURDUR.insertAdjacent(DENIZLI);
        BURDUR.insertAdjacent(MUGLA);
//-------------------------------------------------------------
        BURSA.insertAdjacent(KUTAHYA);
        BURSA.insertAdjacent(BILECIK);
        BURSA.insertAdjacent(SAKARYA);
        BURSA.insertAdjacent(KOCAELI);
        BURSA.insertAdjacent(YALOVA);
        BURSA.insertAdjacent(BALIKESIR);
//-------------------------------------------------------------
        CANAKKALE.insertAdjacent(BALIKESIR);
        CANAKKALE.insertAdjacent(TEKIRDAG);
        CANAKKALE.insertAdjacent(EDIRNE);
//-------------------------------------------------------------
        CANKIRI.insertAdjacent(ANKARA);
        CANKIRI.insertAdjacent(KIRIKKALE);
        CANKIRI.insertAdjacent(CORUM);
        CANKIRI.insertAdjacent(KASTAMONU);
        CANKIRI.insertAdjacent(KARABUK);
        CANKIRI.insertAdjacent(BOLU);
//-------------------------------------------------------------
        CORUM.insertAdjacent(YOZGAT);
        CORUM.insertAdjacent(TOKAT);
        CORUM.insertAdjacent(AMASYA);
        CORUM.insertAdjacent(SAMSUN);
        CORUM.insertAdjacent(SINOP);
        CORUM.insertAdjacent(KASTAMONU);
        CORUM.insertAdjacent(CANKIRI);
        CORUM.insertAdjacent(KIRIKKALE);
//-------------------------------------------------------------
        DENIZLI.insertAdjacent(BURDUR);
        DENIZLI.insertAdjacent(AFYONKARAHISAR);
        DENIZLI.insertAdjacent(USAK);
        DENIZLI.insertAdjacent(MANISA);
        DENIZLI.insertAdjacent(AYDIN);
        DENIZLI.insertAdjacent(MUGLA);
//-------------------------------------------------------------
        DIYARBAKIR.insertAdjacent(MARDIN);
        DIYARBAKIR.insertAdjacent(BATMAN);
        DIYARBAKIR.insertAdjacent(MUS);
        DIYARBAKIR.insertAdjacent(BINGOL);
        DIYARBAKIR.insertAdjacent(ELAZIG);
        DIYARBAKIR.insertAdjacent(MALATYA);
        DIYARBAKIR.insertAdjacent(ADIYAMAN);
        DIYARBAKIR.insertAdjacent(SANLIURFA);
//-------------------------------------------------------------
        EDIRNE.insertAdjacent(CANAKKALE);
        EDIRNE.insertAdjacent(TEKIRDAG);
        EDIRNE.insertAdjacent(KIRKLARELI);
//-------------------------------------------------------------
        ELAZIG.insertAdjacent(DIYARBAKIR);
        ELAZIG.insertAdjacent(BINGOL);
        ELAZIG.insertAdjacent(TUNCELI);
        ELAZIG.insertAdjacent(MALATYA);
//-------------------------------------------------------------
        ERZINCAN.insertAdjacent(TUNCELI);
        ERZINCAN.insertAdjacent(ERZURUM);
        ERZINCAN.insertAdjacent(BAYBURT);
        ERZINCAN.insertAdjacent(GUMUSHANE);
        ERZINCAN.insertAdjacent(GIRESUN);
        ERZINCAN.insertAdjacent(SIVAS);
        ERZINCAN.insertAdjacent(MALATYA);
//-------------------------------------------------------------
        ERZURUM.insertAdjacent(MUS);
        ERZURUM.insertAdjacent(AGRI);
        ERZURUM.insertAdjacent(KARS);
        ERZURUM.insertAdjacent(ARDAHAN);
        ERZURUM.insertAdjacent(ARTVIN);
        ERZURUM.insertAdjacent(RIZE);
        ERZURUM.insertAdjacent(BAYBURT);
        ERZURUM.insertAdjacent(ERZINCAN);
        ERZURUM.insertAdjacent(BINGOL);
//-------------------------------------------------------------
        ESKISEHIR.insertAdjacent(AFYONKARAHISAR);
        ESKISEHIR.insertAdjacent(ANKARA);
        ESKISEHIR.insertAdjacent(BILECIK);
        ESKISEHIR.insertAdjacent(KUTAHYA);
//-------------------------------------------------------------
        GAZIANTEP.insertAdjacent(KILIS);
        GAZIANTEP.insertAdjacent(SANLIURFA);
        GAZIANTEP.insertAdjacent(ADIYAMAN);
        GAZIANTEP.insertAdjacent(KAHRAMANMARAS);
        GAZIANTEP.insertAdjacent(OSMANIYE);
        GAZIANTEP.insertAdjacent(HATAY);
//-------------------------------------------------------------
        GIRESUN.insertAdjacent(SIVAS);
        GIRESUN.insertAdjacent(ERZINCAN);
        GIRESUN.insertAdjacent(GUMUSHANE);
        GIRESUN.insertAdjacent(TRABZON);
        GIRESUN.insertAdjacent(ORDU);
//-------------------------------------------------------------
        GUMUSHANE.insertAdjacent(ERZINCAN);
        GUMUSHANE.insertAdjacent(BAYBURT);
        GUMUSHANE.insertAdjacent(TRABZON);
        GUMUSHANE.insertAdjacent(GIRESUN);
//-------------------------------------------------------------
        HAKKARI.insertAdjacent(VAN);
        HAKKARI.insertAdjacent(SIRNAK);
//-------------------------------------------------------------
        HATAY.insertAdjacent(GAZIANTEP);
        HATAY.insertAdjacent(OSMANIYE);
        HATAY.insertAdjacent(ADANA);
//-------------------------------------------------------------
        ISPARTA.insertAdjacent(ANTALYA);
        ISPARTA.insertAdjacent(KONYA);
        ISPARTA.insertAdjacent(AFYONKARAHISAR);
        ISPARTA.insertAdjacent(BURDUR);
//-------------------------------------------------------------
        MERSIN.insertAdjacent(ADANA);
        MERSIN.insertAdjacent(NIGDE);
        MERSIN.insertAdjacent(KONYA);
        MERSIN.insertAdjacent(KARAMAN);
        MERSIN.insertAdjacent(ANTALYA);
//-------------------------------------------------------------
        ISTANBUL.insertAdjacent(KOCAELI);
        ISTANBUL.insertAdjacent(TEKIRDAG);
        ISTANBUL.insertAdjacent(KIRKLARELI);
//-------------------------------------------------------------
        IZMIR.insertAdjacent(AYDIN);
        IZMIR.insertAdjacent(MANISA);
        IZMIR.insertAdjacent(BALIKESIR);
//-------------------------------------------------------------
        KARS.insertAdjacent(AGRI);
        KARS.insertAdjacent(IGDIR);
        KARS.insertAdjacent(ARDAHAN);
        KARS.insertAdjacent(ERZURUM);
//-------------------------------------------------------------
        KASTAMONU.insertAdjacent(CANKIRI);
        KASTAMONU.insertAdjacent(CORUM);
        KASTAMONU.insertAdjacent(SINOP);
        KASTAMONU.insertAdjacent(BARTIN);
        KASTAMONU.insertAdjacent(KARABUK);
//-------------------------------------------------------------
        KAYSERI.insertAdjacent(ADANA);
        KAYSERI.insertAdjacent(KAHRAMANMARAS);
        KAYSERI.insertAdjacent(SIVAS);
        KAYSERI.insertAdjacent(YOZGAT);
        KAYSERI.insertAdjacent(NEVSEHIR);
        KAYSERI.insertAdjacent(NIGDE);
//-------------------------------------------------------------
        KIRKLARELI.insertAdjacent(EDIRNE);
        KIRKLARELI.insertAdjacent(TEKIRDAG);
        KIRKLARELI.insertAdjacent(ISTANBUL);
//-------------------------------------------------------------
        KIRSEHIR.insertAdjacent(AKSARAY);
        KIRSEHIR.insertAdjacent(NEVSEHIR);
        KIRSEHIR.insertAdjacent(YOZGAT);
        KIRSEHIR.insertAdjacent(KIRIKKALE);
        KIRSEHIR.insertAdjacent(ANKARA);
//-------------------------------------------------------------
        KOCAELI.insertAdjacent(YALOVA);
        KOCAELI.insertAdjacent(BURSA);
        KOCAELI.insertAdjacent(SAKARYA);
        KOCAELI.insertAdjacent(ISTANBUL);
//-------------------------------------------------------------
        KONYA.insertAdjacent(KARAMAN);
        KONYA.insertAdjacent(NIGDE);
        KONYA.insertAdjacent(AKSARAY);
        KONYA.insertAdjacent(ANKARA);
        KONYA.insertAdjacent(ESKISEHIR);
        KONYA.insertAdjacent(AFYONKARAHISAR);
        KONYA.insertAdjacent(ISPARTA);
        KONYA.insertAdjacent(ANTALYA);
//-------------------------------------------------------------
        KUTAHYA.insertAdjacent(USAK);
        KUTAHYA.insertAdjacent(AFYONKARAHISAR);
        KUTAHYA.insertAdjacent(ESKISEHIR);
        KUTAHYA.insertAdjacent(BILECIK);
        KUTAHYA.insertAdjacent(BURSA);
        KUTAHYA.insertAdjacent(BALIKESIR);
        KUTAHYA.insertAdjacent(MANISA);
//-------------------------------------------------------------
        MALATYA.insertAdjacent(ADIYAMAN);
        MALATYA.insertAdjacent(DIYARBAKIR);
        MALATYA.insertAdjacent(ELAZIG);
        MALATYA.insertAdjacent(TUNCELI);
        MALATYA.insertAdjacent(ERZINCAN);
        MALATYA.insertAdjacent(SIVAS);
        MALATYA.insertAdjacent(KAHRAMANMARAS);
//-------------------------------------------------------------
        MANISA.insertAdjacent(IZMIR);
        MANISA.insertAdjacent(AYDIN);
        MANISA.insertAdjacent(DENIZLI);
        MANISA.insertAdjacent(USAK);
        MANISA.insertAdjacent(KUTAHYA);
        MANISA.insertAdjacent(BALIKESIR);
//-------------------------------------------------------------
        KAHRAMANMARAS.insertAdjacent(OSMANIYE);
        KAHRAMANMARAS.insertAdjacent(GAZIANTEP);
        KAHRAMANMARAS.insertAdjacent(ADIYAMAN);
        KAHRAMANMARAS.insertAdjacent(MALATYA);
        KAHRAMANMARAS.insertAdjacent(SIVAS);
        KAHRAMANMARAS.insertAdjacent(KAYSERI);
        KAHRAMANMARAS.insertAdjacent(ADANA);
//-------------------------------------------------------------
        MARDIN.insertAdjacent(SIRNAK);
        MARDIN.insertAdjacent(BATMAN);
        MARDIN.insertAdjacent(DIYARBAKIR);
        MARDIN.insertAdjacent(SANLIURFA);
//-------------------------------------------------------------
        MUGLA.insertAdjacent(ANTALYA);
        MUGLA.insertAdjacent(BURDUR);
        MUGLA.insertAdjacent(DENIZLI);
        MUGLA.insertAdjacent(AYDIN);
//-------------------------------------------------------------
        MUS.insertAdjacent(BATMAN);
        MUS.insertAdjacent(BITLIS);
        MUS.insertAdjacent(AGRI);
        MUS.insertAdjacent(ERZURUM);
        MUS.insertAdjacent(BINGOL);
        MUS.insertAdjacent(DIYARBAKIR);
//-------------------------------------------------------------
        NEVSEHIR.insertAdjacent(NIGDE);
        NEVSEHIR.insertAdjacent(KAYSERI);
        NEVSEHIR.insertAdjacent(YOZGAT);
        NEVSEHIR.insertAdjacent(KIRSEHIR);
        NEVSEHIR.insertAdjacent(AKSARAY);
//-------------------------------------------------------------
        NIGDE.insertAdjacent(MERSIN);
        NIGDE.insertAdjacent(ADANA);
        NIGDE.insertAdjacent(KAYSERI);
        NIGDE.insertAdjacent(NEVSEHIR);
        NIGDE.insertAdjacent(AKSARAY);
        NIGDE.insertAdjacent(KONYA);
//-------------------------------------------------------------
        ORDU.insertAdjacent(TOKAT);
        ORDU.insertAdjacent(SIVAS);
        ORDU.insertAdjacent(GIRESUN);
        ORDU.insertAdjacent(SAMSUN);
//-------------------------------------------------------------
        RIZE.insertAdjacent(TRABZON);
        RIZE.insertAdjacent(BAYBURT);
        RIZE.insertAdjacent(ERZURUM);
        RIZE.insertAdjacent(ARTVIN);
//-------------------------------------------------------------
        SAKARYA.insertAdjacent(BILECIK);
        SAKARYA.insertAdjacent(BOLU);
        SAKARYA.insertAdjacent(DUZCE);
        SAKARYA.insertAdjacent(KOCAELI);
        SAKARYA.insertAdjacent(BURSA);
//-------------------------------------------------------------
        SAMSUN.insertAdjacent(SINOP);
        SAMSUN.insertAdjacent(CORUM);
        SAMSUN.insertAdjacent(AMASYA);
        SAMSUN.insertAdjacent(TOKAT);
        SAMSUN.insertAdjacent(ORDU);
//-------------------------------------------------------------
        SIIRT.insertAdjacent(BATMAN);
        SIIRT.insertAdjacent(SIRNAK);
        SIIRT.insertAdjacent(VAN);
        SIIRT.insertAdjacent(BITLIS);
//-------------------------------------------------------------
        SINOP.insertAdjacent(KASTAMONU);
        SINOP.insertAdjacent(CORUM);
        SINOP.insertAdjacent(AMASYA);
        SINOP.insertAdjacent(SAMSUN);
//-------------------------------------------------------------
        SIVAS.insertAdjacent(KAYSERI);
        SIVAS.insertAdjacent(KAHRAMANMARAS);
        SIVAS.insertAdjacent(MALATYA);
        SIVAS.insertAdjacent(ERZINCAN);
        SIVAS.insertAdjacent(GIRESUN);
        SIVAS.insertAdjacent(ORDU);
        SIVAS.insertAdjacent(TOKAT);
        SIVAS.insertAdjacent(YOZGAT);
//-------------------------------------------------------------
        TEKIRDAG.insertAdjacent(EDIRNE);
        TEKIRDAG.insertAdjacent(CANAKKALE);
        TEKIRDAG.insertAdjacent(ISTANBUL);
        TEKIRDAG.insertAdjacent(KIRIKKALE);
//-------------------------------------------------------------
        TOKAT.insertAdjacent(AMASYA);
        TOKAT.insertAdjacent(YOZGAT);
        TOKAT.insertAdjacent(SIVAS);
        TOKAT.insertAdjacent(ORDU);
        TOKAT.insertAdjacent(SAMSUN);
        TOKAT.insertAdjacent(CORUM);
//-------------------------------------------------------------
        TRABZON.insertAdjacent(GIRESUN);
        TRABZON.insertAdjacent(GUMUSHANE);
        TRABZON.insertAdjacent(BAYBURT);
        TRABZON.insertAdjacent(RIZE);
//-------------------------------------------------------------
        TUNCELI.insertAdjacent(ELAZIG);
        TUNCELI.insertAdjacent(BINGOL);
        TUNCELI.insertAdjacent(ERZINCAN);
        TUNCELI.insertAdjacent(MALATYA);
//-------------------------------------------------------------
        SANLIURFA.insertAdjacent(GAZIANTEP);
        SANLIURFA.insertAdjacent(ADIYAMAN);
        SANLIURFA.insertAdjacent(DIYARBAKIR);
        SANLIURFA.insertAdjacent(MARDIN);
//-------------------------------------------------------------
        USAK.insertAdjacent(MANISA);
        USAK.insertAdjacent(DENIZLI);
        USAK.insertAdjacent(AFYONKARAHISAR);
        USAK.insertAdjacent(KUTAHYA);
//-------------------------------------------------------------
        VAN.insertAdjacent(AGRI);
        VAN.insertAdjacent(BITLIS);
        VAN.insertAdjacent(SIIRT);
        VAN.insertAdjacent(SIRNAK);
        VAN.insertAdjacent(HAKKARI);
//-------------------------------------------------------------
        YOZGAT.insertAdjacent(KIRSEHIR);
        YOZGAT.insertAdjacent(NEVSEHIR);
        YOZGAT.insertAdjacent(KAYSERI);
        YOZGAT.insertAdjacent(SIVAS);
        YOZGAT.insertAdjacent(TOKAT);
        YOZGAT.insertAdjacent(CORUM);
        YOZGAT.insertAdjacent(KIRIKKALE);
//-------------------------------------------------------------
        ZONGULDAK.insertAdjacent(DUZCE);
        ZONGULDAK.insertAdjacent(KARABUK);
        ZONGULDAK.insertAdjacent(BOLU);
        ZONGULDAK.insertAdjacent(BARTIN);
//-------------------------------------------------------------
        AKSARAY.insertAdjacent(KONYA);
        AKSARAY.insertAdjacent(NIGDE);
        AKSARAY.insertAdjacent(NEVSEHIR);
        AKSARAY.insertAdjacent(KIRSEHIR);
        AKSARAY.insertAdjacent(ANKARA);
//-------------------------------------------------------------
        BAYBURT.insertAdjacent(GUMUSHANE);
        BAYBURT.insertAdjacent(ERZINCAN);
        BAYBURT.insertAdjacent(ERZURUM);
        BAYBURT.insertAdjacent(RIZE);
        BAYBURT.insertAdjacent(TRABZON);
//-------------------------------------------------------------
        KARAMAN.insertAdjacent(KONYA);
        KARAMAN.insertAdjacent(ANTALYA);
        KARAMAN.insertAdjacent(MERSIN);
//-------------------------------------------------------------
        KIRIKKALE.insertAdjacent(CANKIRI);
        KIRIKKALE.insertAdjacent(ANKARA);
        KIRIKKALE.insertAdjacent(KIRSEHIR);
        KIRIKKALE.insertAdjacent(YOZGAT);
        KIRIKKALE.insertAdjacent(CORUM);
        KIRIKKALE.insertAdjacent(TEKIRDAG);
//-------------------------------------------------------------
        BATMAN.insertAdjacent(DIYARBAKIR);
        BATMAN.insertAdjacent(MARDIN);
        BATMAN.insertAdjacent(SIRNAK);
        BATMAN.insertAdjacent(SIIRT);
        BATMAN.insertAdjacent(BITLIS);
        BATMAN.insertAdjacent(MUS);
//-------------------------------------------------------------
        SIRNAK.insertAdjacent(MARDIN);
        SIRNAK.insertAdjacent(BATMAN);
        SIRNAK.insertAdjacent(SIIRT);
        SIRNAK.insertAdjacent(VAN);
        SIRNAK.insertAdjacent(HAKKARI);
//-------------------------------------------------------------
        BARTIN.insertAdjacent(ZONGULDAK);
        BARTIN.insertAdjacent(KARABUK);
        BARTIN.insertAdjacent(KASTAMONU);
//-------------------------------------------------------------
        ARDAHAN.insertAdjacent(ARTVIN);
        ARDAHAN.insertAdjacent(ERZURUM);
        ARDAHAN.insertAdjacent(KARS);
//-------------------------------------------------------------
        IGDIR.insertAdjacent(KARS);
        IGDIR.insertAdjacent(AGRI);
//-------------------------------------------------------------
        YALOVA.insertAdjacent(KOCAELI);
        YALOVA.insertAdjacent(BURSA);
//-------------------------------------------------------------
        KARABUK.insertAdjacent(BARTIN);
        KARABUK.insertAdjacent(ZONGULDAK);
        KARABUK.insertAdjacent(BOLU);
        KARABUK.insertAdjacent(CANKIRI);
        KARABUK.insertAdjacent(KASTAMONU);
//-------------------------------------------------------------
        KILIS.insertAdjacent(GAZIANTEP);
//-------------------------------------------------------------
        OSMANIYE.insertAdjacent(ADANA);
        OSMANIYE.insertAdjacent(KAHRAMANMARAS);
        OSMANIYE.insertAdjacent(GAZIANTEP);
        OSMANIYE.insertAdjacent(HATAY);
//-------------------------------------------------------------
        DUZCE.insertAdjacent(SAKARYA);
        DUZCE.insertAdjacent(BOLU);
        DUZCE.insertAdjacent(ZONGULDAK);
//-------------------------------------------------------------
        states = new State[]{
            ADANA, //0
            ADIYAMAN, //1
            AFYONKARAHISAR, //2
            AGRI, //3
            AMASYA, //4
            ANKARA, //5
            ANTALYA, //6
            ARTVIN, //7
            AYDIN, //8
            BALIKESIR, //9
            BILECIK, //10
            BINGOL, //11
            BITLIS, //12
            BOLU, //13
            BURDUR, //14
            BURSA, //15
            CANAKKALE, //16
            CANKIRI, //17
            CORUM, //18
            DENIZLI, //19
            DIYARBAKIR, //20
            EDIRNE, //21
            ELAZIG, //22
            ERZINCAN, //23
            ERZURUM, //24
            ESKISEHIR, //25
            GAZIANTEP, //26
            GIRESUN, //27
            GUMUSHANE, //28
            HAKKARI, //29
            HATAY, //30
            ISPARTA, //31
            MERSIN, //32
            ISTANBUL, //33
            IZMIR, //34
            KARS, //35
            KASTAMONU, //36
            KAYSERI, //37
            KIRKLARELI, //38
            KIRSEHIR, //39
            KOCAELI, //40
            KONYA, //41
            KUTAHYA, //42
            MALATYA, //43
            MANISA, //44
            KAHRAMANMARAS, //45
            MARDIN, //46
            MUGLA, //47
            MUS, //48
            NEVSEHIR, //49
            NIGDE, //50
            ORDU, //51
            RIZE, //52
            SAKARYA, //53
            SAMSUN, //54
            SIIRT, //55
            SINOP, //56
            SIVAS, //57
            TEKIRDAG, //58
            TOKAT, //59
            TRABZON, //60
            TUNCELI, //61
            SANLIURFA, //62
            USAK, //63
            VAN, //64
            YOZGAT, //65
            ZONGULDAK, //66
            AKSARAY, //67
            BAYBURT, //68
            KARAMAN, //69
            KIRIKKALE, //70
            BATMAN, //71
            SIRNAK, //72
            BARTIN, //73
            ARDAHAN, //74
            IGDIR, //75
            YALOVA, //76
            KARABUK, //77
            KILIS, //78
            OSMANIYE, //79
            DUZCE //80
        };

        colorize();

    }
//-------------------------------------------------------------

    public State[] getStates() {
        return states;
    }
//-------------------------------------------------------------

    private boolean checkColor(Color color, State[] adjacents) {
        for (int i = 0; i < adjacents.length; i++) {
            if (color == adjacents[i].getColor()) {
                return true;
            }
        }
        return false;
    }
//-------------------------------------------------------------

    private void colorize() {

        final Color[] color = new Color[5];
        color[0] = Color.GREEN;
        color[1] = Color.BLUE;
        color[2] = Color.CYAN;
        color[3] = Color.YELLOW;
        color[4] = Color.RED;

        
        System.out.println("Color size:"+color.length); 

        for (int i = 0; i < states.length; i++) {
            
            if (states[i].getColor() == Color.WHITE) {
                State[] adjacents = states[i].getAdjacencyList();

                //Color c = color[(int) (Math.random() * color.length)];
                Color c = color[0];
                int cn=color.length-1;
                while (checkColor(c, adjacents)) {
                    //System.out.println(c);
                    //c = color[(int) (Math.random() * color.length)];                    
                    c = color[cn--];                    
                    if(cn<0){
                        System.out.println("\n\n-------------\n"+color.length+"-color is not enough.\n-------------");
                        System.exit(0);
                    }
                }                
                states[i].setColor(c);
            }

        }
    }
//-------------------------------------------------------------
//-------------------------------------------------------------
//-------------------------------------------------------------

}
