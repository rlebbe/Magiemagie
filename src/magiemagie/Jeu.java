/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Jeu {

//    private Carte carteCorneLicorne = new Carte();
//    private Carte carteBaveCrapaud = new Carte();
//    private Carte carteMandragore = new Carte();
//    private Carte carteAileChauveSouris = new Carte();
//    private Carte carteLapisLazuli = new Carte();
    private ArrayList<Joueur> joueurs = new ArrayList<>();
    private Joueur joueurEnCours;

    public void lancerLancerInvisibilite() {
//        if (this.joueurEnCours.getCarte().contains(carteCorneLicorne)
//                    && this.joueurEnCours.getCarte().contains(carteBaveCrapaud));
//            else System.out.println("commande invalide");
    }

    public void lancerPhiltreDamour() {
//                if (this.joueurEnCours.getCarte().contains(carteCorneLicorne)
//                    && this.joueurEnCours.getCarte().contains(carteMandragore));
//            else System.out.println("commande invalide");
    }

    public void lancerHypnose() {
//        if (this.joueurEnCours.getCarte().contains(carteBaveCrapaud)
//                    && this.joueurEnCours.getCarte().contains(carteLapisLazuli));
//            else System.out.println("commande invalide");

    }

    public void lancerDivination() {
//        if (this.joueurEnCours.getCarte().contains(carteLapisLazuli)
//                    && this.joueurEnCours.getCarte().contains(carteAileChauveSouris));
//            else System.out.println("commande invalide");

    }

    public void lancerSomeilProfond() {
//        if (this.joueurEnCours.getCarte().contains(carteMandragore)
//                    && this.joueurEnCours.getCarte().contains(carteAileChauveSouris));
//            else System.out.println("commande invalide");

    }

    public void lancerSort() {
        boolean terminer = false;

        //affiche les sorts possibles pour joueurEnCour
        Carte carteCorneLicorne = new Carte();
        Carte carteBaveCrapaud = new Carte();
        Carte carteMandragore = new Carte();
        Carte carteAileChauveSouris = new Carte();
        Carte carteLapisLazuli = new Carte();
        carteCorneLicorne.setType(Carte.TypeCarte.CORNE_DE_LICORNE);
        carteBaveCrapaud.setType(Carte.TypeCarte.BAVE_DE_CRAPAUD);
        carteAileChauveSouris.setType(Carte.TypeCarte.AILE_DE_CHAUVE_SOURIS);
        carteMandragore.setType(Carte.TypeCarte.MANDRAGORE);
        carteLapisLazuli.setType(Carte.TypeCarte.LAPIS_LAZULI);

        do {
            if (this.joueurEnCours.getCarte().contains(carteCorneLicorne)
                    && this.joueurEnCours.getCarte().contains(carteBaveCrapaud)) {
                System.out.println("[1] Invisibilite");
            }

            if (this.joueurEnCours.getCarte().contains(carteCorneLicorne)
                    && this.joueurEnCours.getCarte().contains(carteMandragore)) {
                System.out.println("[2] Philtre d'amour");
            }

            if (this.joueurEnCours.getCarte().contains(carteBaveCrapaud)
                    && this.joueurEnCours.getCarte().contains(carteLapisLazuli)) {
                System.out.println("[3] Hypnose");
            }

            if (this.joueurEnCours.getCarte().contains(carteLapisLazuli)
                    && this.joueurEnCours.getCarte().contains(carteAileChauveSouris)) {
                System.out.println("[4] Divination");
            }

            if (this.joueurEnCours.getCarte().contains(carteMandragore)
                    && this.joueurEnCours.getCarte().contains(carteAileChauveSouris)) {
                System.out.println("[5] Sommeil profond");
            }

            System.out.print("Choisir le sort a lancer : ");

            //saisie sort a lance
            Scanner diffSort = new Scanner(System.in);
            String sort = diffSort.nextLine();

            switch (sort) {
                case "1":
                    this.lancerLancerInvisibilite();
                    terminer = true;
                    break;
                case "2":
                    this.lancerPhiltreDamour();
                    terminer = true;
                    break;
                case "3":
                    this.lancerHypnose();
                    terminer = true;
                    break;
                case "4":
                    this.lancerDivination();
                    terminer = true;
                    break;
                case "5":
                    this.lancerSomeilProfond();
                    terminer = true;
                    break;
                default:
                    System.out.println("Ce sort n'existe pas");
                    return;
            }

        } while (terminer == false);

        //suppression des 2 cartes utilisées
    }

    public void passerTour() {

    }

    public void menuAction() {

        boolean terminer = false;
        do {
            //affiche menu
            System.out.println("A vous de jouer " + this.joueurEnCours.getNom());
            System.out.println("Vos cartes :" + this.joueurEnCours.getCarte());

            System.out.print("Action possibles : [1] Lancer un sort, [2] Passer son tour\n"
                    + "Votre choix : ");

            Scanner scan = new Scanner(System.in);
            String choix = scan.nextLine();

            //lancer un sort ou passer tour
            switch (choix) {
                case "1":
                    this.lancerSort();
                    terminer = true;
                    break;
                case "2":
                    this.passerTour();
                    terminer = true;
                default:
                    System.out.println("Commande invalide");
                    break;
            }
        } while (terminer == false);

    }

    public Joueur getJoueurEnCours() {
        return joueurEnCours;
    }

    public void setJoueurEnCours(Joueur joueurEnCours) {
        this.joueurEnCours = joueurEnCours;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public void afficherMenuPrincipal() {

        boolean quitter = false;

        while (quitter == false) {

            //afficher le menu principal
            System.out.println("Menu Principal\n"
                    + "\n"
                    + "[1]Nom du joueur.\n"
                    + "[2]Commencer la partie.\n"
                    + "[3]Quitter\n"
                    + "[4]Afficher la liste des joueurs"
                    + "\n"
                    + "Votre choix : ");

            //saisie au clavier
            Scanner scanner = new Scanner(System.in);
            String choixUtil = scanner.nextLine();
            switch (choixUtil) {
                case "1":
                    afficherMenuNouveauJoueur();
                    break;
                case "2":
                    demarrerPartie();
                    break;
                case "3":
                    quitter = true;
                    break;
                case "4":
                    System.out.println(this.joueurs);
                    break;
                default:
                    System.out.println("Ce choix n'est pas possible.");
                    break;
            }
        }
    }

    public void afficherMenuNouveauJoueur() {
        //affichage du menu

        System.out.print("Entrer le nom du nouveau joueur :\n");
        //saisie au clavier du nom du joueur
        Scanner scanner = new Scanner(System.in);
        String nomJoueur = scanner.nextLine();

        //creation du joueur et set du nom
        Joueur nouveau = new Joueur();
        nouveau.setNom(nomJoueur);

        //ajout du joueur dans la liste des joueurs
        this.joueurs.add(nouveau);
        System.out.println("Le nom du nouveau joueur est : " + nomJoueur);

    }

    public void demarrerPartie() {

        //1.distribue 7 cartes par joueur
        for (Joueur joueur : joueurs) {

            //1.1.distribuer 7 cartes aléatoires pour le joueur actuel
            for (int i = 0; i < 7; i++) {

                Carte carte = new Carte();

                Random random = new Random();
                int nb = random.nextInt(5);

                switch (nb) {
                    case 0:
                        carte.setType(Carte.TypeCarte.AILE_DE_CHAUVE_SOURIS);
                        break;

                    case 1:
                        carte.setType(Carte.TypeCarte.MANDRAGORE);
                        break;

                    case 2:
                        carte.setType(Carte.TypeCarte.BAVE_DE_CRAPAUD);
                        break;

                    case 3:
                        carte.setType(Carte.TypeCarte.CORNE_DE_LICORNE);
                        break;

                    case 4:
                        carte.setType(Carte.TypeCarte.LAPIS_LAZULI);
                        break;

                    default:
                        break;

                }
                joueur.getCarte().add(carte);
            }

        }
        //donne la main au premier joueur
        this.joueurEnCours = this.joueurs.get(0);

        //3.afficher le menu action
        this.menuAction();

    }

}
