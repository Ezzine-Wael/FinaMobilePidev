/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeship.entities;

/**
 *
 * @author SAFAA
 */
public class Produit {
      private int id;
    private String nom;
    private String photo;
    private double prix;
    private int quantite;
    private Categorie categorie;
    private int etat;
  //  private  User user;
     
    
    
    
    
 public  Produit() {
    }
  public Produit(int id, int quantite, int etat, String nom, float prix) {
        this.id = id;
        this.quantite = quantite;
        this.etat = etat;
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(int quantite, int etat, String nom, float prix) {
        this.quantite = quantite;
        this.etat = etat;
        this.nom = nom;
        this.prix = prix;
    }


    public Produit(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }


    public Produit(int id, String nom, String photo, double prix, int quantite, Categorie categorie, int etat) {
        this.id = id;
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.etat = etat;
       // this.user = user;
    }
    public Produit(int id,String nom, String photo, double prix, int quantite,int etat) {
        this.id=id;
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.etat = etat;
        //this.user = user;
    }
    public Produit(String nom, String photo, double prix, int quantite, Categorie categorie, int etat) {
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.etat = etat;
        //this.user = user;
    }
    
        public Produit(String nom, String photo, double prix, int quantite, Categorie categorie) {
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.etat = etat;
        //this.user = user;
    }

    public Produit(String nom, String photo, double prix, int quantite, int etat) {
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.etat = etat;
    }


    public Produit(int id) {
        this.id = id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    
    

   

   /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", photo=" + photo + ", prix=" + prix + ", quantite=" + quantite + ", categorie=" + categorie + ", etat=" + etat + ", user=" +  '}';
    }
    

    


  
 

   
  
   
}
