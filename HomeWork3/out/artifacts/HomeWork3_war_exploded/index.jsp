<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Playing</title>
</head>

<body>
<form  action="count" method="POST">
  <p><h2>Please, enter your name, age and select answer:</h2></p>
  <p>Name: <input required type="text" name="name"></p>
  <p>Age: <input required type="number" size="3" min="1" max="100" name="age"></p>
  <p><h3>The better answer is:</h3></p>
  <p><input required type = "radio"  name="labeled" value = "1" id="labeled_1" /><label for="labeled_1"> I'm the best answer! </label></p>
  <p><input type = "radio"  name="labeled" value = "2" id="labeled_2" /><label for="labeled_2"> No! I'm the best answer! </label></p>
  <p><input type = "radio"  name="labeled" value = "3" id="labeled_3" /><label for="labeled_3"> No! I'm the best of the bests answer! </label></p>
  <p><input type = "radio"  name="labeled" value = "4" id="labeled_4" /><label for="labeled_4"> No!!! I'm the best of the bests of the bests!!! </label></p>
  <p><input type="submit"></p>
</form>


<br><br><br>
<form  action="count"  method="GET">
  <button type="submit" name="showlist" value="1">Show all</button>
</form>
</body>
</html>