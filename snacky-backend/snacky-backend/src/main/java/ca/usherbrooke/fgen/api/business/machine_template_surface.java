package ca.usherbrooke.fgen.api.business;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class machine_template_surface {

    @JsonProperty("Manufacturer")
    public String manufacturier_type_m;

    @JsonProperty("Model")
    public String model_type_m;

    @JsonProperty("id")
    public Integer id_machine;
}
