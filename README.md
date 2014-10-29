kassihiki
=========

Ohtu

* CI: http://ohtu.jamo.io/view/miniprojektit/job/kassihiki-miniprojekti/
* App: http://kh-viitteidenhallinta.herokuapp.com/
* Loppuraportti: https://github.com/timmyke/kassihiki/blob/master/loppuraportti.pdf?raw=true


Asenna alkuun heroku remoteksi: 
<pre>
git remote add heroku git@heroku.com:kh-viitteidenhallinta.git
</pre>



Projektin käynnistäminen:
<pre>
mvn jetty:run
</pre>

Heroku käynnistää projektin alla olevalla komennolla. Jos softa ei käynnisty herokussa, voit tutkia vikaa alla olevien komentojen avulla.
<pre>
mvn clean install
java -jar target/dependency/webapp-runner.jar target/*.war
</pre>

Publishaus:
<pre>
git add .
git commit -m "Pakollinen commit message"
git pull		-- Napataan tuoreimmat muutokset versiohallinnasta
git push origin master	-- pushaa githubiin, master branchiin
-- Tarkistetaan CI:n antama palaute. Jos näyttää hyvältä, niin
git push heroku master -- pushaa Herokuun
</pre>

