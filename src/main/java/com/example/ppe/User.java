package com.example.ppe;

import javax.persistence.*;
import java.util.Date;
@Table(name="users")
@Entity
public class User {

        @Id
        @GeneratedValue
        private int id;
        @Column(name="Email")
        private String email;
        @Column(name="Prénom")
        private String prenom;
        @Column(name="Nom")
        private String nom;
        @Column(name="MdP")
        private String mdp;

        public int getId(){return id;}
        public void setId(int id){
            this.id=id;
        }
        public String getEmail(){return email; }
        public void setEmail(String email){
            this.email=email;
        }

        public User(String email, String password, String nom, String prenom) {
            this.email=email;
            this.mdp=password;
            this.prenom=prenom;
            this.nom=nom;
        }
        public User(){}
    }

