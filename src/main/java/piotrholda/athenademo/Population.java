package piotrholda.athenademo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Population {

    private Integer locid;
    private String location;
    private Integer time;
    private String agegrp;
    private String agegrpstart;
    private String agegrpspan;
    private Integer popmale;
    private Integer popfemale;
    private Integer poptotal;

    public Population(Integer locid, String location, Integer time, String agegrp, String agegrpstart, String agegrpspan, Integer popmale, Integer popfemale, Integer poptotal) {
        this.locid = locid;
        this.location = location;
        this.time = time;
        this.agegrp = agegrp;
        this.agegrpstart = agegrpstart;
        this.agegrpspan = agegrpspan;
        this.popmale = popmale;
        this.popfemale = popfemale;
        this.poptotal = poptotal;
    }

    public Integer getLocid() {
        return locid;
    }

    public void setLocid(Integer locid) {
        this.locid = locid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getAgegrp() {
        return agegrp;
    }

    public void setAgegrp(String agegrp) {
        this.agegrp = agegrp;
    }

    public String getAgegrpstart() {
        return agegrpstart;
    }

    public void setAgegrpstart(String agegrpstart) {
        this.agegrpstart = agegrpstart;
    }

    public String getAgegrpspan() {
        return agegrpspan;
    }

    public void setAgegrpspan(String agegrpspan) {
        this.agegrpspan = agegrpspan;
    }

    public Integer getPopmale() {
        return popmale;
    }

    public void setPopmale(Integer popmale) {
        this.popmale = popmale;
    }

    public Integer getPopfemale() {
        return popfemale;
    }

    public void setPopfemale(Integer popfemale) {
        this.popfemale = popfemale;
    }

    public Integer getPoptotal() {
        return poptotal;
    }

    public void setPoptotal(Integer poptotal) {
        this.poptotal = poptotal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("locid", locid)
                .append("location", location)
                .append("time", time)
                .append("agegrp", agegrp)
                .append("agegrpstart", agegrpstart)
                .append("agegrpspan", agegrpspan)
                .append("popmale", popmale)
                .append("popfemale", popfemale)
                .append("poptotal", poptotal)
                .toString();
    }
}
