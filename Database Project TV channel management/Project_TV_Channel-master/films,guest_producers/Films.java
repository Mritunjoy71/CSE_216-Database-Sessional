/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Mritunjoy
 */
public class Films {
    String program_id,film_name,film_type,episode_no,duration,director_name,producer_name,actor_name,actress_name;
    public Films(String program_id, String film_name, String film_type, String episode_no, String duration, String director_name, String producer_name,String actor_name ,String actress_name) {
        this.program_id = program_id;
        this.film_name = film_name;
        this.film_type = film_type;
        this.episode_no = episode_no;
        this.duration = duration;
        this.director_name = director_name;
        this.producer_name = producer_name;
        this.actor_name = actor_name;
        this.actress_name =actress_name;
       
    }

    public String getProgram_id() {
        return program_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public String getFilm_type() {
        return film_type;
    }

    public String getEpisode_no() {
        return episode_no;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirector_name() {
        return director_name;
    }

    public String getProducer_name() {
        return producer_name;
    }

    public String getActor_name() {
        return actor_name;
    }

    public String getActress_name() {
        return actress_name;
    }

    public void setProgram_id(String program_id) {
        this.program_id = program_id;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
    }

    public void setEpisode_no(String episode_no) {
        this.episode_no = episode_no;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public void setProducer_name(String producer_name) {
        this.producer_name = producer_name;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public void setActress_name(String actress_name) {
        this.actress_name = actress_name;
    }

    @Override
    public String toString() {
        return "Films{" + "program_id=" + program_id + ", film_name=" + film_name + ", film_type=" + film_type + ", episode_no=" + episode_no + ", duration=" + duration + ", director_name=" + director_name + ", producer_name=" + producer_name + ", actor_name=" + actor_name + ", actress_name=" + actress_name + '}';
    }
    
    
    
}
