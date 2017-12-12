/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.fri.series.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Benjamin Kastelic
 * @since 2.3.0
 */
public class Info {

    private List<String> github;
    private List<String> mikrostoritve;
    private List<String> dockerhub;
    private String opis_projekta;
    private List<String> clani;
    private List<String> travis;

    public List<String> getGithub(){
        return this.github;
    }
    public void setGithub(List<String> github) {
        this.github = github;
    }

    public List<String> getMikrostoritve(){
        return this.mikrostoritve;
    }
    public void setMikrostoritve(List<String> mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }

    public List<String> getDockerhub(){
        return this.dockerhub;
    }
    public void setDockerhub(List<String> dockerhub) {
        this.dockerhub = dockerhub;
    }

    public String getOpisProjekta(){
        return this.opis_projekta;
    }
    public void setOpisProjekta(String opis) {
        this.opis_projekta = opis;
    }

    public List<String> getClani(){
        return this.clani;
    }
    public void setClani(List<String> clani) {
        this.clani = clani;
    }

    public List<String> getTravis(){
        return this.travis;
    }
    public void setTravis(List<String> travis) {
        this.travis = travis;
    }

    public Info(){
        this.setGithub(Arrays.asList("https://github.com/SeriesStream/SeriesStream", "https://github.com/SeriesStream/SeriesStream-catalog", "https://github.com/SeriesStream/SeriesStream-parcheese"));
        this.setMikrostoritve(Arrays.asList("http://159.8.79.87:30933/v1/series/", "http://159.8.79.87:30933/v1/episodes/", "http://159.8.79.87:31522/v1/parcheeses"));
        this.setDockerhub(Arrays.asList("https://hub.docker.com/r/lavrinec/series-stream/", "https://hub.docker.com/r/lavrinec/series-stream-catalog/", "https://hub.docker.com/r/lavrinec/series-stream-parcheese/"));
        this.setOpisProjekta("SeriesStream je aplikacija, ki je namenjenja spletnim pretočnim vsebinam, med katerimi izstopajo predvsem serije.");
        this.setClani(Arrays.asList("ml9987"));
        this.setTravis(Arrays.asList("https://travis-ci.org/SeriesStream/SeriesStream", "https://travis-ci.org/SeriesStream/SeriesStream-catalog", "https://travis-ci.org/SeriesStream/SeriesStream-parcheese"));
    }

}
