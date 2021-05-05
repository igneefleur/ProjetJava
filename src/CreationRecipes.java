import java.util.ArrayList;
import java.util.Arrays;

public class CreationRecipes {

public CreationRecipes(Modele m) {
		Recette r1 = new Recette(1,"Moelleux au chocolat",2,new String[]{"Sucre", "Moelleux"},"Etape 1 : \n Faire fondre le chocolat \n"
                + "Etape 2 : \n Ajouter le beurre en morceaux peu a peu et l'incorporer pour obtenir un crame bien lisse. \n "
                + "Etape 3 : \n Mettre la farine et le sucre glace dans un saladier. Ajouter les oeufs entiers et melanger jusqu'a obtention d'une amulsion homogane. \n "
                + "Etape 4 : \n Verser le melange chocolat-beurre sur cette preparation. Malanger. \n "
                + "Etape 5 : \n Beurrer et fariner 6 moules individuels ou un grand moule. \n "
                + "Etape 6 : \n Verser la preparation et mettre a four chaud (200 C) - 10 min pour les petits gateaux, 15 pour le grand. \n "
                + "Etape 7 : \n Servir tiade avec une crame anglaise (le centre doit atre coulant) ou servir froid nappa de ganache au chocolat."
                ,false,"./images/moelleux_chocolat.jpg"
                );
		Recette r2 = new Recette(2,"Crepes",1,new String[]{"Sucre"},"Etape 1 : \n Dans un saladier, melanger la farine, le sel et le sucre. \n "
                + "Etape 2 : \n Faire une Fontaine \n "
                + "Etape 3 : \n Ajouter les oeufs et commencer a les incorporer a la farine avec une cuillere en bois, ajouter le beure fondu (tiadi) peu a peu et bien malaxer.\n"
                + "Etape 4 : \n Incorporer le lait (par petites quantites au debut pour eviter les grumeaux), ajouter le parfum. \n "
                + "Etape 5 : \n Faire cuire les crepes dans une poale chaude huilae."
                ,false,"./images/crepes.jpg"
				);
		Recette r3 = new Recette(3,"Quiche",1,new String[]{"Sale"},
                "Etape 1 \n Prechauffer le four, etaler la pate dans le moule \n "
                + "Etape 2 \n La piquer avec une fourchette. Parsemer de copeaux de beurre \n "
                + "Etape 3 : \n Faire rissoler les lardons a la poele \n "
                + "Etape 4 : \n Battre les oeufs, la creme fraiche et le lait \n"
                + "Etape 5 : \n Ajouter les lardons \n "
                + "Etape 6 : \n Assaisonner de sel, poivre et de muscade \n "
                + "Etape 7 : \n Verser sur la pate \n "
                + "Etape 8 : \n Cuire 45 a 50min \n "
                ,false,"./images/quiche.jpg"
				);
		Recette r4 = new Recette(4,"Pizza",1,new String[]{"Sale"},
		        "Etape 1 \n Verser la farine dans un grand saladier et y faire un puits. \n\n "
		        + "Etape 2 \n Verser la levure, le sel et le sucre dans un verre doseur. Ajouter 1/4 de litre d'eau tiede, bien melanger. Couvrir d'un film plastique et laisser reposer environ 10 minutes (jusqu'a l'apparition d'une mousse brune bien epaisse en surface). \n\n "
		        + "Etape 3 : \n Verser le melange du verre doseur dans le saladier, melanger a la main. Puis quand la pate n'est plus collante petrir environ 5 minutes a la main sur une surface farinee. Arroser d'un peu d'huile d'olive, puis petrir a nouveau environ 5 minutes. \n\n "
		        + "Etape 4 : \n Laisser reposer au moins 1 h sous un linge humide dans un endroit tiede (a cota d'un radiateur, d'une cheminee ou d'un poele en hiver). \n\n "
		        + "Etape 5 : \n Apras repos, petrir quelques instants puis diviser la pate en trois boules agales (on peut en congeler). Etaler la pate sur une surface farinee. Badigeonner la plaque d'un peu d'huile d'olive avant d'y appliquer la pate. Cuisson 10 minutes a 220 C (thermostat 7-8).\n\n "
		        ,false,"./images/pizza.jpg"
				);
		Recette r5 = new Recette(5,"Croque Monsieur",1,new String[]{"Sale"},
                "Etape 1 \n Melanger dans un saladier la creme, le gruyere, saler et poivrer a votre gout.  \n "
				+ "Etape 2 : \n Prendre une tranche de pain de mie etaler dessus le melange creme/gruyere, poser dessus 1/2 tranche de jambon, poser dessus un tranche de pain de mie sur laquelle on a encore etale le meme melange.  \n"
				+ "Etape 3 : \n Avec ces proportions on doit pouvoir faire 12 croques.  \n"
				+ "Etape 4 : \n Mettre au four a mi-hauteur Th 7 pendant 20 mn.  \n"
				,false,"./images/croque_monsieur.jpg"
				);
		Recette r6 = new Recette(6,"Cookie",1,new String[]{"Sale"},
                "Etape 1 \n Travaillez le beurre mou avec les deux sucres jusqu'a obtention d'un melange homogene.\n "
				+ "Eatpe 2 : \n Ajoutez les oeufs et melangez bien. \n "
				+ "Etape3 : \n Joignez la farine tamisee, le sel et la levure en poudre.\n"
				+ "Etape 4 : \n Melangez a nouveau. \n "
				+ "Etape 5 : \n Rajoutez les pepites de chocolat et melangez. \n "
				+ "Etape 6 : \n Recouvrez le plateau du four de papier cuisson ou sulfurise, et a l'aide de 2 cuillares a cafe, disposez-y des petits tas de pate de la valeur d'une noix. \n "
				+ "Etape 7 : \n Veillez a bien les espacer car la pate s'etale assez fort. \n "
				+ "Etape 8 : \n Enfournez et comptez une dizaine de minutes de cuisson (four prachauffa a 180 C). \n"
				+ "Etape 9 : \n Laissez les cookies cuits sur une grille pour les refroidir. \n"
				,false,"./images/cookie.jpg"
				);

		Recette r7 = new Recette(7, "Tiramisu a la fraise", 2 , new String[]{"Sucre", "Dessert", "Bon Marche"},
                ""
                        + "Ingredients :\n\n"
                        + "20cl d'amaretto\n"
                        + "150g de sucre\n"
                        + "32 biscuits a la cuillere\n"
                        + "500g de fraises\n"
                        + "6 oeufs\n"
                        + "500g de fromage frais\n\n"
                        
		        + "Etape 1 :\n\nPour commencer, separer les blancs des jaunes d’œufs.\n\n "
		        + "Etape 2 :\n\nDans les jaunes, verser 125 g de sucre et melanger pour faire blanchir les jaunes.\n\n"
		        + "Etape 3 :\n\nY incorporer le fromage blanc et melanger.\n\n"
		        + "Etape 4 :\n\nPrendre environ 100 g de fraises et les mixer avec 65 g de sucre pour preparer un coulis de fraise. \n\n"
		        + "Etape 5 :\n\nVerser l'amaretto dans le coulis de fraise. \n\n"
		        + "Etape 6 :\n\nMonter les blancs en neige bien fermes. \n\n"
		        + "Etape 7 :\n\nVerser le melange œuf et fromage blanc doucement dans les blancs montes en neige, en tournant les blancs toujours dans le meme sens pour ne pas les casser. \n\n"
		        + "Etape 8 :\n\n Verser un peu de coulis de fraise a la preparation pour lui donner une couleur un peu rosee.\n\n"
		        + "Etape 9 :\n\nTremper les biscuits a la cuillere dans le coulis, et les disposer dans un plat assez haut sur tout le fond du plat.\n\n"
		        + "Etape 10 :\n\nVerser le melange fromage frais et œuf dessus en couche pour recouvrir le tout, déposer la moitie des fraises sur la preparation.\n\n"
		        + "Etape 11 :\n\nRecommencer l'operation avec les biscuits, le melange (s'il vous reste du coulis, l'incorporer au melange fromage et œuf) et remettre les restes des fraises sur le dessus.\n\n"
		        + "Etape 12 :\n\nMettre le tiramisu 8h à 12h au frais avant degustation.\n\n"
		        ,false,"./images/tiramisu.jpg"
				);

		Recette r8 = new Recette(8, "Mousse glacee cerise", 2 , new String[]{"Sucre", "Dessert", "Moyennement Cher", "Cerise", "Gourmand", "Froid"},
                ""
                		+ "Ingredients :\n\n"
                		+ "Du citron\n"
                		+ "300g de sucre glace\n"
                		+ "500g de cerises fraiches\n"
                		+ "500ml de creme fraiche\n"
                		+ "\n\n"
                		
				+ "Etape 1 :\n\nMixer ensemble les cerises denoyautees, le jus de citron et le sucre jusqu'a l'obtention d'une creme liquide onctueuse.\n\n "
				+ "Etape 2 :\n\nBattre la creme fraiche et incorporer le tout.\n\n"
				+ "Etape 3 :\n\nMettre dans un moule choisi et decorer a loisir.\n\n"
				+ "Etape 4 :\n\nMettre au congelateur pour environ 3 heures.\n\n"
				,false,"./images/mousse_glace_cerise.jpg"
				);
		
		Recette r9 = new Recette(9, "Dolmas", 1 , new String[]{"Feuille", "Appetissant", "Joli", "Bon Marche", "Sain"},
                ""
                        + "Ingredients :\n\n"
                        + "Du poivre\n"
                        + "1 cuillere a soupe d'huile d'olive\n"
                        + "1 cube de bouillon de volaille\n"
                        + "1 bouquet\n"
                        + "1 citron\n"
                        + "30g de pignons de pin\n"
                        + "30 feuilles de vignes\n"
                        + "1 oignon\n"
                        + "100g de riz rond\n"
                        + "\n\n"
                        
                + "Etape 1 :\n\nBlanchissez a l’eau bouillante les feuilles pendant 6 minutes. Laissez refroidir et reservez. \n\n "
                + "Etape 2 :\n\nPelez et emincez l’oignon pendant 30 sec / vit. 7 / 0 C.\n\n"
                + "Etape 3 :\n\nFaites-le dorer avec l’huile d’olive et le riz pendant 4 min / vit. 1 / 110 C / marche a gauche.\n\n"
                + "Etape 4 :\n\nVersez 40 cl d’eau, emiettez le cube de bouillon, puis pre-cuisez le riz pendant 8 min / vit. 1 / 110 C / marche a gauche en versant le riz apres ebullition.\n\n"
                + "Etape 5 :\n\nEgouttez le riz, puis melangez-le avec les pignons de pin, le poivre, le persil cisele, le jus du citron. \n\n"
                + "Etape 6 :\n\nDéposez une c. a cafe de farce au riz sur chaque feuille de vigne (face sans nervure). Rabattez les bords puis roulez bien serre. Disposez-les dans le panier vapeur. Badigeonnez d’huile et deposez dessus les demi-citrons. \n\n"
                + "Etape 7 :\n\nVersez 50 cl d’eau dans la cuve de votre Monsieur Cuisine, installez le panier, lancez une cuisson vapeur pendant 35 min / vit. 1 / 130 C. Mettez au frais 1 heure.\n\n"
                ,false,"./images/dolmas.jpg"
                );
		
		Recette r10 = new Recette(10, "Confiture cerise", 2 , new String[]{"Sucre", "Confiture", "Moyennement Cher", "Cerise", "Gourmand", "Exquis", "Rhubarbe"},
                ""
                        + "Ingredients :\n\n"
                        + "2kg de sucre cristallise\n"
                        + "1kg de cerises noires\n"
                        + "1kg de rhubarbe\n"
                        + "5cl de kirsch\n"
                        + "\n\n"
                        
                + "Etape 1 :\n\nPeler la rhubarbe et la couper en tronçons. La mettre dans une casserole avec 15cl d'eau. Porter a ebullition et faire cuire a feu moyen 20 min en remuant plusieurs fois. \n\n "
                + "Etape 2 :\n\nVerser la rhubarbe et son jus de cuisson dans une bassine a confiture. Ajouter le sucre et faire cuire 15 min en ecumant et en remuant plusieurs fois. \n\n"
                + "Etape 3 :\n\nPendant ce temps, equeuter et denoyauter les cerises. \n\n"
                + "Etape 4 :\n\nPlonger les cerises dans la bassine a confiture, verser le kirsch et poursuivre la cuisson 10 min (la confiture est prete lorsque qu'une goutte deposee sur une assiette froide ne s'etale pas).\n\n"
                + "Etape 5 :\n\nVerser dans les pots, visser les couvercles et retourner les pots. Laisser refroidir le contenu avant de remettre les pots sur leur base.\n\n"
                ,false,"./images/confiture_cerise.jpg"
                );
		
		Recette r11 = new Recette(11, "Tiramisu a la cerise", 2 , new String[]{"Sucre", "Dessert", "Bon Marche", "Cerise"},
                ""
                        + "Ingredients :\n\n"
                        + "20cl d'amaretto\n"
                        + "150g de sucre\n"
                        + "32 biscuits a la cuillere\n"
                        + "400g de cerises\n"
                        + "6 oeufs\n"
                        + "500g de fromage frais\n\n"
                        
		        + "Etape 1 :\n\nPour commencer, separer les blancs des jaunes d’œufs.\n\n "
		        + "Etape 2 :\n\nDans les jaunes, verser 125 g de sucre et melanger pour faire blanchir les jaunes.\n\n"
		        + "Etape 3 :\n\nY incorporer le fromage blanc et melanger.\n\n"
		        + "Etape 4 :\n\nPrendre environ 100 g de cerises et les mixer avec 65 g de sucre pour preparer un coulis de fraise. \n\n"
		        + "Etape 5 :\n\nVerser l'amaretto dans le coulis de cerises. \n\n"
		        + "Etape 6 :\n\nMonter les blancs en neige bien fermes. \n\n"
		        + "Etape 7 :\n\nVerser le melange œuf et fromage blanc doucement dans les blancs montes en neige, en tournant les blancs toujours dans le meme sens pour ne pas les casser. \n\n"
		        + "Etape 8 :\n\n Verser un peu de coulis de fraise a la preparation pour lui donner une couleur un peu rosee.\n\n"
		        + "Etape 9 :\n\nTremper les biscuits a la cuillere dans le coulis, et les disposer dans un plat assez haut sur tout le fond du plat.\n\n"
		        + "Etape 10 :\n\nVerser le melange fromage frais et œuf dessus en couche pour recouvrir le tout, déposer la moitie des cerises sur la preparation.\n\n"
		        + "Etape 11 :\n\nRecommencer l'operation avec les biscuits, le melange (s'il vous reste du coulis, l'incorporer au melange fromage et œuf) et remettre les restes des cerises sur le dessus.\n\n"
		        + "Etape 12 :\n\nMettre le tiramisu 8h à 12h au frais avant degustation.\n\n"
		        ,false,"./images/tiramisu.jpg"
				);
		
		
		ArrayList<Recette> r = new ArrayList<Recette>(Arrays.asList(r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11));
		for (int i=0; i<r.size(); i++) {
			m.ajouterRecette(r.get(i));
		}
		m.saveRecettes();
	}
	
}
