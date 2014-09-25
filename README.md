kassihiki
=========

Ohtu

* CI: http://ohtu.jamo.io/view/miniprojektit/job/kassihiki-miniprojekti/
* App: http://kh-viitteidenhallinta.herokuapp.com/


Asenna alkuun heroku remoteksi: 
<pre>
git remote add heroku git@heroku.com:kh-viitteidenhallinta.git
</pre>


Projektin kääntäminen ja käynnistäminen:

<pre>
mvn clean install
java -jar target/dependency/webapp-runner.jar target/*.war
</pre>

Publishaus:

<pre>
git add .
git commit -m "Pakollinen commit message"
git push origin master -- pushaa githubiin, master branchiin
-- Tarkistetaan CI:n antama palaute. Jos näyttää hyvältä, niin
git push heroku master -- pushaa Herokuun
</pre>

