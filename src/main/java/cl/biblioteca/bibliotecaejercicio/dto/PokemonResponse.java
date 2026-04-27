package cl.biblioteca.bibliotecaejercicio.dto;

public class PokemonResponse {
 
    private Long id;
    private String name;
    private Boolean is_legendary;

    /* Adicionales */
    private Boolean is_mythical;
    private int capture_rate;
    /* ----------- */

    public Long getId() {
        return id;
    }
 
 
    public void setId(Long id) {
        this.id = id;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public void setName(String name) {
        this.name = name;
    }
 
 
    public Boolean getIs_legendary() {
        return is_legendary;
    }
 
 
    public void setIs_legendary(Boolean isLegendary) {
        this.is_legendary = isLegendary;
    }

    /* Adicionales */

    public int getCapture_rate(){
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate){
        this.capture_rate = capture_rate;
    }

    public Boolean getIs_mythical(){
        return is_mythical;
    }

    public void setIs_mythical(boolean is_mythical){
        this.is_mythical = is_mythical;
    }
}
