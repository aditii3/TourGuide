package com.example.android.tourguide.data;

import android.util.Log;

import com.example.android.tourguide.R;

import java.util.ArrayList;
import java.util.List;


public final class LocationAssests {

    private static final List<Location> location = new ArrayList<Location>() {{
        add(new Location("Amsterdam", R.drawable.amsterdam, "geo:0,0?q=Amsterdam"));
        add(new Location("Barcelona", R.drawable.barcelona, "geo:0,0?q=Barcelona"));
        add(new Location("Paris", R.drawable.paris, "geo:0,0?q=Paris"));

    }};

    public static List<String> getAmsterdamFoodDescription() {
        return amsterdamFoodDescription;
    }

    public static List<Location> getParisHotelList() {
        return parisHotelList;
    }

    public static List<Location> getParisPlacesList() {
        return parisPlacesList;
    }

    public static List<Location> getBarcelonaHostelList() {
        return barcelonaHostelList;
    }

    public static List<Location> getParisHostelList() {
        return parisHostelList;
    }

    public static List<String> getAmsterdamGeneralDescription() {
        return amsterdamGeneralDescription;
    }

    public static List<String> getBarcelonaGeneralDescription() {
        return barcelonaGeneralDescription;
    }

    public static List<String> getParisGeneralDescription() {
        return parisGeneralDescription;
    }

    public static List<String> getBarcelonaFoodDescription() {
        return barcelonaFoodDescription;
    }

    public static List<String> getParisFoodDescription() {
        return parisFoodDescription;
    }

    public static List<String> getAmsterdamPlacesDescription() {
        return amsterdamPlacesDescription;
    }

    public static List<String> getBarcelonaPlacesDescription() {
        return barcelonaPlacesDescription;
    }

    public static List<String> getParisPlacesDescription() {
        return parisPlacesDescription;
    }

    public static List<String> getAmsterdamHostelsDescription() {
        return amsterdamHostelsDescription;
    }

    public static List<String> getBarcelonaHostelDescription() {
        return barcelonaHostelDescription;
    }

    public static List<String> getParisHostelDescription() {
        return parisHostelDescription;
    }

    private static final List<Location> amsterdamGeneral = new ArrayList<Location>() {
        {
            add(new Location("Climate", R.drawable.amsterdam_weather, "geo:0,0?q=Amsterdam"));
            add(new Location("Fashion", R.drawable.amsterdam_fashion, "geo:0,0?q=Amsterdam"));
            add(new Location("Culture", R.drawable.amsterdam_culture, "geo:0,0?q=Amsterdam"));

        }
    };
    private static final List<Location> barcelonaGeneral = new ArrayList<Location>() {{
        add(new Location("Climate", R.drawable.barcelona_climate, "geo:0,0?q=Barcelona"));
        add(new Location("Fashion", R.drawable.barcelona_fashion, "geo:geo:0,0?q=Barcelona"));
        add(new Location("Culture", R.drawable.barcelona_culture, "geo:0,0?q=Barcelona"));
    }};

    public static List<Location> getParisGeneral() {
        return parisGeneral;
    }

    private static final List<Location> parisGeneral = new ArrayList<Location>() {{
        add(new Location("Climate", R.drawable.paris_climate, "geo:0,0?q=Paris"));
        add(new Location("Fashion", R.drawable.paris_fashion, "geo:0,0?q=Paris"));
        add(new Location("Culture", R.drawable.paris_culture, "geo:0,0?q=Paris"));
    }};
    private static final List<Location> amsterdamHotelList = new ArrayList<Location>() {{
        add(new Location("De Silveren Spiegel", R.drawable.amsterdam_food_1, "geo:0,0?q=De Silveren Spiegel"));
        add(new Location("Librije's Zusje Amsterdam", R.drawable.amsterdam_food_2, "geo:0,0?q=Librije's Zusje Amsterdam"));
        add(new Location("La Rive", R.drawable.amsterdam_food_3, "geo:0,0?q=La Rive,Amsterdam"));
        add(new Location("Restaurant Daalder", R.drawable.amsterdam_food_4, "geo:0,0?q=Restaurant Daalder,Amsterdam"));
    }};

    public static List<Location> getBarcelonaPlacesList() {
        return barcelonaPlacesList;
    }

    public static List<Location> getBarcelonaHotelList() {
        return barcelonaHotelList;
    }

    public static List<Location> getBarcelonaGeneral() {
        return barcelonaGeneral;
    }

    private static final List<Location> barcelonaHotelList = new ArrayList<Location>() {
        {
            add(new Location("L’ANTICA PIZZERIA DA MICHELE BARCELONA", R.drawable.barcelona_food_1, "geo:0,0?q=L’ANTICA PIZZERIA DA MICHELE BARCELONA"));
            add(new Location("IL BIRRINO", R.drawable.barcelona_food_2, "geo:0,0?q=IL BIRRINO,Barcelona"));
            add(new Location("RESTAURANT TOMÁS (PALÀ DE TORROELLA)", R.drawable.barcelona_food_3, "geo:0,0?q=RESTAURANT TOMÁS (PALÀ DE TORROELLA),Barcelona"));

        }
    };
    private static final List<Location> parisHotelList = new ArrayList<Location>() {
        {
            add(new Location("Mokonuts", R.drawable.paris_food_1, "geo:0,0?q=Mokonuts,Paris"));
            add(new Location("Astrance", R.drawable.paris_food_2, "geo:0,0?q=Astrance,Paris"));
            add(new Location("Septime", R.drawable.paris_food_3, "geo:0,0?q=Septime,Paris"));
            add(new Location("Abri Soba", R.drawable.paris_food_4, "geo:0,0?q=Abri Soba,Paris"));

        }
    };

    private static final List<Location> amsterdamPlacesList = new ArrayList<Location>() {
        {
            add(new Location("Rijksmuseum", R.drawable.amsterdam_place_1, "geo:0,0?q=Rijksmuseum,Amsterdam"));
            add(new Location("Heineken Experience", R.drawable.amsterdam_place_2, "geo:0,0?q=Heineken Experience,Amsterdam"));
            add(new Location("Anne Frank House", R.drawable.amsterdam_place_3, "geo:0,0?q=Anne Frank House,Amsterdam"));
            add(new Location("The National Maritime Museum | Het Scheepvaartmuseum", R.drawable.amsterdam_place_4, "geo:0,0?q=The National Maritime Museum,Amsterdam"));

        }
    };
    private static final List<Location> barcelonaPlacesList = new ArrayList<Location>() {{
        add(new Location("Sagrada Familia", R.drawable.barcelona_place_1, "geo:0,0?q=Sagrada Familia,Barcelona"));
        add(new Location("La Rambla", R.drawable.barcelona_place_2, "geo:0,0?q=La Rambla,Barcelona"));
        add(new Location("Casa Batlló", R.drawable.barcelona_place_3, "geo:0,0?q=Casa Batlló,Barcelona"));
        add(new Location("Plaça de Catalunya", R.drawable.barcelona_place_4, "geo:0,0?q=Plaça de Catalunya,Barcelona"));

    }};
    private static final List<Location> parisPlacesList = new ArrayList<Location>() {{
        add(new Location("Museu Picasso", R.drawable.paris_place_1, "geo:0,0?q=Museu Picasso,Paris"));
        add(new Location("Notre-Dame", R.drawable.paris_place_2, "geo:0,0?q=Notre-Dame,Paris"));
        add(new Location("Versailles Palace and Museum", R.drawable.paris_place_3, "geo:0,0?q=Versailles Palace and Museum,Paris"));

    }};
    private static final List<Location> amsterdamHostelList = new ArrayList<Location>() {
        {
            add(new Location("Via Amsterdam", R.drawable.amsterdam_hostel_1, "geo:0,0?q=,Amsterdam"));
            add(new Location("MEININGER Amsterdam City West", R.drawable.amsterdam_hostel_2, "geo:0,0?q=MEININGER Amsterdam City West,Amsterdam"));
            add(new Location("ClinkNOORD", R.drawable.amsterdam_hostel_3, "geo:0,0?q=ClinkNOORD,Amsterdam"));
            add(new Location("Stayokay Amsterdam Vondelpark", R.drawable.amsterdam_hostel_4, "geo:0,0?q=Stayokay Amsterdam Vondelpark,Amsterdam"));
        }
    };
    private static final List<Location> barcelonaHostelList = new ArrayList<Location>() {
        {
            add(new Location("HOSTEL ONE PARALELO", R.drawable.barcelona_hostel_1, "geo:0,0?q=HOSTEL ONE PARALELO,Barcelona"));
            add(new Location("HOSTEL ONE RAMBLAS", R.drawable.barcelona_hostel_2, "geo:0,0?q=HOSTEL ONE RAMBLAS,Barcelona"));
            add(new Location("HOSTEL ONE SANTS", R.drawable.barcelona_hostel_3, "geo:0,0?q=HOSTEL ONE SANTS,Barcelona"));
            add(new Location("SANT JORDI HOSTEL GRACIA", R.drawable.barcelona_hostel_4, "geo:0,0?q=SANT JORDI HOSTEL GRACIA,Barcelona"));
        }
    };

    private static final List<Location> parisHostelList = new ArrayList<Location>() {
        {
            add(new Location("Les Piaules", R.drawable.paris_hostel_1, "geo:0,0?q=Les Piaules,Paris"));
            add(new Location("Pariscoree", R.drawable.paris_hostel_2, "geo:0,0?q=Pariscoree,Paris"));
            add(new Location("Mary's Hotel", R.drawable.paris_hostel_3, "geo:0,0?q=Mary's Hotel,Paris"));
        }
    };

    private static final List<String> amsterdamGeneralDescription = new ArrayList<String>() {{
        add("Amsterdam has an oceanic climate strongly influenced by its proximity to the North Sea to the west, with prevailing westerly winds. Both winters and summers are considered mild, although winters can get quite cold, while summers are quite warm occasionally.\n" +
                "Amsterdam, as well as most of the North Holland province, lies in USDA Hardiness zone 8b. Frosts mainly occur during spells of easterly or northeasterly winds from the inner European continent. Even then, because Amsterdam is surrounded on three sides by large bodies of water, as well as having a significant heat-island effect, nights rarely fall below −5 °C (23 °F), while it could easily be −12 °C (10 °F) in Hilversum, 25 kilometres (16 miles) southeast.\n" +
                "Summers are moderately warm with a number of hot days every month. The average daily high in August is 22.1 °C (71.8 °F), and 30 °C (86 °F) or higher is only measured on average on 2.5 days, placing Amsterdam in AHS Heat Zone 2. The record extremes range from −19.7 °C (−3.5 °F) to 35.7 °C (96.3 °F).[58] Days with more than 1 millimetre (0.04 in) of precipitation are common, on average 133 days per year.\n" +
                "Amsterdam's average annual precipitation is 838 millimetres (33 in) more than what is measured at Amsterdam Schiphol Airport. A large part of this precipitation falls as light rain or brief showers. Cloudy and damp days are common during the cooler months of October through March.");
        add("Fashion brands like G-star, Gsus, BlueBlood, PICHICHI, Iris van Herpen, fair trade denim brand MUD Jeans, 10 feet and Warmenhoven and Venderbos, and fashion designers like Mart Visser, Viktor and Rolf, Sheila de Vries, Marlies Dekkers and Frans Molenaar are based in Amsterdam. Modelling agencies Elite Models, Touche models and Tony Jones have opened branches in Amsterdam. Fashion models like Yfke Sturm, Doutzen Kroes and Kim Noorda started their careers in Amsterdam. Amsterdam has its garment centre in the World Fashion Center. Buildings which formerly housed brothels in the red light district have been converted to ateliers for young fashion designers, AKA eagle fuel.[citation needed] Fashion photographers Inez van Lamsweerde and Vinoodh Matadin were born in Amsterdam(Netherland).");
        add("Art runs in the Netherlands’ DNA, from Rembrandt and the old masters through Van Gogh all the way to an exciting contemporary art scene. Amsterdam is home to a variety of world-famous museums: the Rijksmuseum and the Rembrandt House Museum are a must for those wanting to delve into the artistic wealth of the Golden Age. The Van Gogh Museum houses a beautiful and touching collection of the works of one of the most famous Dutch painters. And the Stedelijk Museum takes the visitor on a journey through the last 150 years of art, offering a great overview of modern and contemporary art, design and architecture. Amsterdam is great for going to gigs: legendary venues such as Paradiso and Melkweg make Amsterdam a popular stop for almost all major touring pop and rock bands and acts, and the city offers a wide variety of intimate clubs as well as the bigger arenas, such as the Ziggo Dome and AFAS Live, to boot. The Dutch also have a clear passion for jazz, world and blues music, as evidenced by world-class international players that continually return to Amsterdam and its variety of jazz venues such as Bimhuis and the many smaller jazz cafés. Amsterdam has a thriving film festival scene, hosting a huge variety of events including the Imagine Film Festival, Cinekid, the KLIK! Amsterdam Animation Festival, the Roze Filmdagen, the World Cinema Amsterdam festival and the internationally acclaimed International Documentary Film Festival Amsterdam (IDFA). ");
    }};
    private static final List<String> barcelonaGeneralDescription = new ArrayList<String>() {{
        add("August is the hottest month in Barcelona with an average temperature of 24°C (74°F) and the coldest is January at 10°C (49°F) with the most daily sunshine hours at 10 in July. The wettest month is October with an average of 87mm of rain. The best month to swim in the sea is in August when the average sea temperature is 26°C (79°F).");
        add("Middle age and the older generation generally tend to wear clothing with muted and conservative colours. The younger generation tend to wear semi-casual clothes like jeans and a T shirts and comfortable shoes or sandals during summer.\n" +
                "\n" + "The Catalans care about their personal appearance and image. They wear a wide variety of types of clothes however generally they do not wear overly casual clothes. The Catalans like to look good in a conservative way. They are keen on designer clothes but even more important to them is quality and fitting. It is not hard to find Catalan clothes of good quality at a reasonable price, which is also good news for visitors.\n" + "\n" + "With clothes there are no definitive rules. We have stated that generally the Catalans are conservative however there are also exceptions to this e.g. Custo Barcelona and Desigual are famous brands here in Barcelona and are noted for their vibrant colours.");
        add("In Barcelona you are in one of the liveliest, most unusual, most innovative, artistic, vibrant cities but stilll with a heart that hasn't changed for 500 years. Although modern day Barcelona is a mixture of Catalan and Spanish, it is, at heart, dynamically Catalan. It is the capital city of the Catalan region, which was once a historically prosperous nation in its own right. Catalans are extremely proud of their regional identity, culture and language. Catalunya was not part of ‘Spain’ as it is today until Ferdinand of Aragón married Isabel of Castille in the late 15th century. Prior to the merger brought about by the marriage of the 'Reyes Católicos ' the region was prosperous in its own right, especially during the Middle Ages, as you will see from the public buildings and private palaces in the Cuitat Vella (Old City) today.");

    }};
    private static final List<String> parisGeneralDescription = new ArrayList<String>() {{
        add("Paris experiences mostly mild weather across four distinct seasons. Average daily highs range from 46°F (8°C) in the winter to 77°F (25°C) at the height of summer. Extreme cold or heat are pretty rare, but rain is not. In Paris, light showers can come and go quickly throughout the day. To get a better idea of what kind of weather you can expect on your trip to the City of Light, have a look at the following table, which lists the city’s monthly average temperatures and rainfall days.");
        add("Paris is known as the home to many high-end fashion houses, such as Dior, Hermes, Louis Vuitton and Chanel. Many French people dress in a sophisticated, professional and fashionable style, but it is not overly fussy. Typical outfits include nice dresses, suits, long coats, scarves and berets.");
        add("Most people associate French culture with Paris, which is a center of fashion, cuisine, art and architecture, but life outside of the City of Lights is very different and varies by region.");
    }};

    private static final List<String> amsterdamFoodDescription = new ArrayList<String>() {{
        add("Despite appearances, this precariously crooked building near the solid Round Lutheran Church is here to stay: it's managed to remain standing since 1614, and it should certainly last through your dinner of contemporary Dutch cuisine prepared by talented young chef Yves van der Hoff, whose father owns the place. Inside \"The Silver Mirror,\" wood beams, Delft tiles, and candlelit tables create a romantic mood in which to enjoy local ingredients like smoked Volendammer eel and roasted North Sea scallops, and expertly prepared meat plates like Dutch beef steak with potato mousseline and crispy onions. To sample a little of everything, opt for one of the three- to six-course tasting menus.");
        add("Experience Librije’s Zusje Amsterdam, an unforgettable culinary experience in the heart of Waldorf Astoria Amsterdam. ... Executive Chef Sidney Schutte will take you on a vibrant culinary journey. ... “De Librije's Zusje Amsterdam and me got along like a house on fire.”");
        add("Inside the InterContinental Amstel Amsterdam Hotel—the lodging of choice for royalty, dignitaries, and rock stars—La Rive is the city's unparalleled purveyor of refined French and Mediterranean food. The setting is chic and refined, with views directly onto the river and formal service that is solicitous but not stuffy. There are several prix-fixe choices with optional wine pairings, though you can also order à la carte. Ingredients focus on the best of the best, from caviar to lobster to Wagyu sirloin, all creatively prepared and gorgeously presented; each dish is a work of art. Book ahead, as this has long been known as one of Amsterdam's haute-cuisine showplaces.");
        add("The menus are simple, you have a choice of 4, 5 or 6 courses or the surprise chefs menu which is seven courses. There is also a flight of wines by the glass to accompany the menu should you so wish. The prices are also very reasonable for each menu. The wine list is extensive and has a good range to offer for all budgets, excellently pieced together by maitre sommelier Tim Grashuis. ");

    }};
    private static final List<String> barcelonaFoodDescription = new ArrayList<String>() {{
        add("The venue, on Consell de Cent lacks character and has the air of a quick refurbishment; from the outside it could be mistaken for a fast food franchise. But you don’t go to Da Michele for the decor. You go for the pizza. And the pizza is good. The flour, tomato and mozzarella are imported every week from Naples. So is the wood used in the oven. The dough is slow fermented at a controlled temperature for 36 hours so it’s flavoursome, stretchy and easy to digest. Blasted for 45 seconds in the oven, it’s perfect. The base is the secret of great Neapolitan pizza and Da Michele gets it exactly right. ");
        add("Appearances can be deceptive. At first glance, Il Birrino hasn’t got much going for it. It’s well off the beaten track and in the unlikely event you were strolling past, you’d probably keep going. The promise of craft beer is alluring and there’s live music at certain times but it looks more like a fun hipster bar than a food destination.\n" + "\n" + "Inside, it’s a happy mess. The walls are cheaply painted with an Exorcist-green paint redolent of neglectful care homes in a documentary about society’s sad abandonment of its elderly. ");
        add("The tasting menu hors d’oeuvres began with a slight misstep.  Paper-thin crunchy pig-skin wafers were served with a tasty paste of white Ganxet beans but the skins were too brittle to serve as scoops and repeatedly shattered. A rethink of the dish is required. A second hors d’oeuvre – endives with anchovy cream and shaved walnuts – was unremarkable but easier to eat.\n" +
                "\n" +
                "Huge ham croquettes came next, each loaded with around 35 grams of quality jamón – Iberian cured ham from Jabugo. These bad boys were flavour and calorie bombs, oozing greasy goodness through crisp shells. As good a ham croquette.");
    }};
    private static final List<String> parisFoodDescription = new ArrayList<String>() {{
        add("€45 per person for a choice between of three starters, mains and desserts. Lunch is €20-25 for three courses. On weeknights, you can book for groups of six to twelve.\n" +
                "\n" +
                "Mokonuts is our go-to darling, our most treasured address. Why? Behind that open counter, Omar Koreitem is conjuring up unique, globe-trotting dishes inspired by his Levantine roots. The to-die-for sweet treats baked by his business partner, Moko Hirayama, are unmissable. Glowing word-of-mouth reviews have done most of the leg work for Mokonuts, but it’s just as fresh and exciting as when it was born. Bravo!");

        add("Weekday lunchtimes, when you can get a three Michelin-starred meal for just €75.\n" +
                "\n" +
                "For eighteen years, Pascal Barbot has been tirelessly churning out stunning dishes to fit the market – and his mood. He has not achieved such prowess with just his virtuoso; his audacity plays a big part (which three Michelin-starred joint would have dared to serve chilli sorbet, for example?) The room has remained unchanged for twenty years, but year after year, some dishes remain unmatchable. Book well in advance (we’re talking a month) for the €75 lunch menu (€120 with wine pairings).");
        add("This is THE hottest table in the world, curated by Bertrand Grébaut, one of the most talented chefs of his generation – who was trained by industry heavyweights Robuchon and Passard. We will never stop being amazed by Septime’s ability to renew itself and push boundaries year after year. It gets our vote every time – for the perfect décor (raw wood tables, exposed beams), for the spot-on, but not obsequious service and dishes that will linger on long after you have cleared your plate. The only drawback? Getting a table is like being a contestant on the Hunger Games.");
        add("€6-9 for small plates, €9-17 for sobas (add €6 for the lunch menu, with salad, rice and a tapas dish).\n" +
                "\n" +
                "Admittedly, we love chef Katsuaki Okiyama’s first address, the cute Japanese bistro Abri, but it’s his second brainchild that makes us go weak at the knees. For its zen Japanese décor, its wooded walls and concrete floor – but mostly for the sublime buckwheat soba noodles, to be slurped in a hot or cold broth. The delicate and flavouful broth is the best in Paris. The evening menu is more refined – think sake steamed clams, miso pork roll salad and a short but perfectly formed wine list.");
    }};
    private static final List<String> amsterdamPlacesDescription = new ArrayList<String>() {{
        add("As well as being a national treasure in its own right, the Rijksmuseum's internationally revered collection features some of the most famous national treasures in Amsterdam and the Netherlands, including historic art by Vermeer, Frans Hals, and perhaps most notably Rembrandt’s ‘The Night Watch’, which takes pride of place in a beautifully lit hall allowing visitors to enjoy every tiny detail. Learn more about Rembrandt in Amsterdam.");
        add("The Heineken Brewery Tour takes you through the company’s history in a fun and interactive way. As you walk through the impressive old building you’ll be able to see the gigantic copper tanks that were used to brew the original Heineken beer, the company’s old advertisements, and even draft your own beer in the Heineken Museum bar. The Heineken Brewery Tour is an exciting high-tech multimedia experience available in several languages including English, French, Dutch, Russian, German, Chinese, Portuguese, Italian and Spanish. You can also download the Heineken Experience App to get the most out of your visit. At the end of the Heineken Brewery Tour, which lasts around one and a half hours on average, you’ll be able to enjoy two complimentary drinks while you relax in the bar. Non-alcoholic drinks are also available and you can try your hand at drafting your own Heineken!");
        add("Anne Frank is one of Amsterdam’s most well known former residents. The Anne Frank House at Prinsengracht 263 in Amsterdam is where she lived in hiding with her family for more than two years during World War II. Now converted into a museum it contains a sobering exhibition about the persecution of the Jews during the war, as well as discrimination in general.");
        add("The museum is dedicated to maritime history and contains many artefacts associated with shipping and sailing. The collection contains, among other things, paintings, scale models, weapons and world maps. The paintings depict Dutch naval officers such as Michiel de Ruyter and historical sea battles.\n" +
                "\n" +
                "The map collection includes works by 17th-century cartographers Willem Blaeu and his son Joan Blaeu. The museum also has a surviving copy of the first edition of Maximilianus Transylvanus' work, De Moluccis Insulis, the first to describe Ferdinand Magellan's voyage around the world.");
    }};
    private static final List<String> barcelonaPlacesDescription = new ArrayList<String>() {
        {
            add("The interior of the church is just an impressive as the exterior, in the crypt you can see Gaudi's final resting place; in the nave there are pillars which resemble thick trees and the ceiling is a remarkable vaulted structure where the \"branches\" of the trees meet. Visitors can take an elevator and walk up into the towers. The church has 5 naves and a crossing forming a Latin Cross. The central nave is 15 meters wide; the nave and apse are 90 meters long; crossing is 60 meters and the width of the crossing is 30 meters. The incredible architecture and artistry of the Basilica is Barcelona's top must-see site although construction is still in progress.");
            add("In a city where the streets are rather narrow this one is wide.  The boulevard soon became a popular hang-out and place to see and be seen. The landmark buildings along La Rambla include the Palau de la Virreina and the Boqueria Market. You'll find many tourist attractions along Rambla like the Wax Museum and Erotica Museum as well as street performers, artists selling their paintings and souvenir stores.");
            add("The interior of the house is just as remarkable, there is a staircase banister which looks like the spine of an animal; a room which is decorated to look like it is under water; relief glazed tiles; a wooden elevator which still functions; a huge central skylight; stained glass; mosaics and unexpected details in many of the fittings. In all the building's ground floor, main floor, four self-contained floors, roof top terrace, loft and courtyard cover 5,000m².");
            add("The square has an oval center surrounded by a line of trees, within the oval there are benches. The square is home to several works of public art and monuments like Pastor de Pau by Pablo Gargallo; sculptures by Josep Llimona; the Monument a Francesc Macia (the former president of Catalan government) and La Deessa o l'Enigma statue by Josep Clara. In the northern portion of the square there are a number of fountains which are lit up at night. The buildings surrounding the square include El Corte Ingles department store, several theatres, cafes, restaurants, hotels, banks and below the square you can find a major transport hub or metro lines, railways and subway stations. ");
        }
    };
    private static final List<String> parisPlacesDescription = new ArrayList<String>() {{
        add("The Museu Picasso houses one of the most extensive collections of artworks by the 20th-century Spanish artist Pablo Picasso. With 4,251 works exhibited by the painter, the museum has one of the most complete permanent collections of works. The museum is housed in five adjoining medieval palaces in Barcelona's La Ribera and is located on Montcada Street in the (Bank District) of Barcelona.[1] It opened to the public on 9 March 1963,[2] becoming the first museum dedicated to Picasso's work and the only one created during the artist's life. It has since been declared a museum of national interest by the Government of Catalonia.[3]\n" +
                "\n" +
                "Highlights of the collection include two of his first major works, The First Communion (1896), and Science and Charity (1897). In particular, the Museu Picasso reveals Picasso's relationship with the city of Barcelona, a relationship that was shaped in his youth and adolescence and continued until his death.");
        add("Notre-Dame de Paris meaning \"Our Lady of Paris\"), also known as Notre-Dame Cathedral or simply Notre-Dame, is a medieval Catholic cathedral on the Île de la Cité in the fourth arrondissement of Paris, France.[3] The cathedral is widely considered to be one of the finest examples of French Gothic architecture, and it is among the largest and best-known church buildings in the Catholic Church in France, and in the world. The naturalism of its sculptures and stained glass serve to contrast it with earlier Romanesque architecture.\n" +
                "\n" +
                "As the cathedral of the Archdiocese of Paris, Notre-Dame contains the cathedra of the Archbishop of Paris, currently Michel Aupetit. The cathedral treasury contains a reliquary, which houses some of Catholicism's most important relics, including the purported Crown of Thorns, a fragment of the True Cross, and one of the Holy Nails.");
        add("The Palace of Versailles has been listed as a World Heritage Site for 30 years and is one of the greatest achievements in French 17th century art. Louis XIII's old hunting pavilion was transformed and extended by his son, Louis XIV, when he installed the Court and government there in 1682. A succession of kings continued to embellish the Palace up until the French Revolution.\n" +
                "\n" +
                "Today the Palace contains 2,300 rooms spread over 63,154 m2.");
    }};
    private static final List<String> amsterdamHostelsDescription = new ArrayList<String>() {{
        add("Only 10 minutes from the centre of Amsterdam we created a multi-functional playground for the curious new-age traveller ready to stretch their minds with new exhilarating experiences. Via Amsterdam is here to connect you to the local scene. May it be in the city or in one of our fly and fresh designed communal spaces. Our aim is to help you to travel differently and discover the city in creative new ways. Who is ‘you’? ‘You’ can be a group or an individual. ‘You’ can be corporate or leisure. One thing is sure. ‘You’ is welcome. Just come as you are.\n" +
                "Cycle hire is available directly from the property and can be used to cycle to see all the local attractions or directly into Amsterdam central.");
        add("Meininger is all about convenience. It\\'s situated only two minutes from the Sloterdijk Railway Station and only 15 from the airport. Its rooms are comfy, clean and affordable; all you\\'d need for a stay in Amsterdam. Obviously, it\\'s Europe\\'s premier party town and the Meininger bar is the perfect place to warm up before a night out. Grab an ice cold local beer from Amsterdam or deuce is out with fellow internationals on the football table.");
        add("ClinkNOORD is located in the culturally vibrant area of Amsterdam Noord, just 10 minutes from the back of Amsterdam Centraal Station. Simply catch the short free ferry across the IJ River, which runs 24/7, and the hostel is 3 minutes by foot when you get off. ClinkNOORD has modern Dutch-style interiors and a friendly, laid back atmosphere. The hostel offers dormitory accommodation, private rooms, free Wi-Fi throughout the building and a great-value buffet breakfast for EUR 6,90. \n" +
                "\n" +
                "Original features from the beautiful 1920’s laboratory building have been retained, including an impressive stained glass window that runs right to the top floor. The hostel has some fantastic social spaces including a library / work space, a sunny and spacious atrium, a café and an in-hostel bar which is a great place to meet fellow travellers. There’s also a modern self-catering kitchen (available from 12.30pm – 12am) and flexible spaces for meetings and events. ");
        add("Get the real Amsterdam feel and stay in the green heart of Amsterdam! \n" +
                "\n" +
                "This modern Hostelling International hostel is centrally located right in the middle of the famous Vondelpark, within walking distance of the Van Gogh Museum and the Rijksmuseum. We’re at crawling distance from the Leidseplein, with its famous nightlife and clubs like Paradiso, Melkweg and Jimmy Woo!\n" +
                "\n" +
                "The hostel is partly located in a monumental chalet building from which you’ll have a stunning view over the Vondelpark!\n" +
                "\n" +
                "Here you will find also our Brasserie Bite and Drink, a cool place for a cold drink and a hot meal.");

    }};
    private static final List<String> barcelonaHostelDescription = new ArrayList<String>() {{
        add("Hostel One Paralelo is consistently rated one of the best hostels in Barcelona (and Europe for that matter). It’s part of the Hostel One (who also wins awards for being one of the best small chains) so you know their standards are high. The staff is awesome and they organize all kinds of activities (free nightly dinners, drinking games, pub crawls, etc.). There is also a fully-equipped kitchen, laundry facilities, and multiple common areas.\n" + "\n" + "This is certainly a lively hostel with a fun and welcoming atmosphere. That said, if you’re looking for a peaceful night’s sleep then this probably shouldn’t be your top choice (or at least book a private room).\n" + "\n" + "Beds start around €35/night");
        add("Hostel One Ramblas is another excellent hostel that’s part of the Hostel One chain of hostels. This hostel gets great reviews all-around — great atmosphere, staff, location, cleanliness, etc. They offer a free dinner every night and a free bar/club crawl. They also have a well-equipped kitchen, laundry, and a rooftop terrace.\n" +
                "\n" +
                "This is another lively hostel so you’re bound to make lots of friends and have a great time. That said, if you’re looking for a peaceful night’s sleep then this probably shouldn’t be your top choice (or at least book a private room).\n" +
                "\n" +
                "Beds start around €35/night");
        add("Another great Hostel One hostel — Hostel One Sants. You’ll love the free nightly dinners, drinking games, free pub/club crawls, and other events this award-winning hostel offers. The atmosphere is top notch. The staff is amazing. It’s clean. The beds are comfortable. They have laundry and plenty of common areas. Like all Hostel One properties, Sants is lively and can be a party hostel. The Sants is a bit outside the “center” of Barcelona but it’s near two subway stops.\n" +
                "\n" +
                "Beds start around €35/night");
        add("The Sant Jordi Hostel Gracia is an award-winning hostel that’s located in a very hip part of Barcelona with lots of bars and restaurants. It’s a bit far from most of the city’s sights/touristy stuff but all that is a short subway ride away. The staff is super welcoming and they have a free nightly dinner and pub crawl. The hostel itself is modern, clean, and the beds get great reviews. There is also a kitchen and a rooftop terrace. The atmosphere is lively so expect a bit of noise at night but nothing too crazy.\n" +
                "\n" +
                "Beds start around €37/night");


    }};
    private static final List<String> parisHostelDescription = new ArrayList<String>() {{
        add("Les Piaules, the most Parisian hostel. Recently opened by 3 young Parisian travelers in a fully renovated art deco building. Les Piaules offers a rooftop terrace with fantastic view on Paris iconic monuments, fast free WiFi, check-out until 12am, custom bunk beds (with curtains, reading light, power plugs, private lockers and comfy mattress), the coolest bar in town with a carefully curated selection of local beer, coffee and French specialties. \n" +
                "\n" +
                "Also offer: 24/7 check-in, Multilingual staff, Local food and drinks, Custom bunked, City expert desk, High speed free WiFi, Badass breakfast, Rooftop terrace & view.\n" +
                "\n" +
                "Les Piaules is located in the arty district of Belleville which features a bunch of bars and coffee shops full of young and cool people, and close to all must-see in Paris (50m from Belleville metro hub).");
        add("Pariscoree is the ideal place for your perfect stay in Paris.We offer all amenities a traveler could expect including free linen,free breakfast,free WiFi,free safe box, free maps of Paris,reading lamp,hairdryer, laundry facilities. You can find also a lovely outdoor terrace.\n" +
                "\n" +
                "Pariscoree is a new,lovely and cozy hostel. Located only 1min away from Metro line 7 station Le Kremin-Bicêtre,we're very close to center of Paris.We are only 15 minutes by metro from the Louvre, Notre Dame and 20 minutes from the Opera. The entrance number is 4121\n" +
                "\n" +
                "Pariscoree has 3 nice room. A warm welcome,friendly atmosphere and cleanliness are our top priorities.");
        add("Mary's hotel is nice and comfortable with lowest price in PARIS.\n" +
                "It`s situated close to the center, in a quite street between Republique place and Bastille place (place of the french revolution). It`s easy to get to all big and famous sights: Eiffel Tower, Champs Elysees, Musee du louvre ...\n" +
                "\n" +
                "Great rooms- Mary's hotel offers you wide choice of private room (single, double, triple, quad), you`ll feel at home in our clean, fully equipped rooms. The comfortable mattresses and sturdy bunks will ensure you a good night`s rest while the bright dcor makes our rooms comfortable and inviting. \n" +
                "\n" +
                "The best service - Our well informed, helpful staff members are travelers from all over the world and we each want to make sure you enjoy Paris as much as we do! ");
    }};

    public static List<Location> getLocation() {
        Log.d("GETTing", "");
        return location;
    }

    public static List<Location> getAmsterdamGeneral() {
        return amsterdamGeneral;
    }

    public static List<Location> getAmsterdamHotelList() {
        return amsterdamHotelList;
    }

    public static List<Location> getAmsterdamPlacesList() {
        return amsterdamPlacesList;
    }

    public static List<Location> getAmsterdamHostelList() {
        return amsterdamHostelList;
    }


}
