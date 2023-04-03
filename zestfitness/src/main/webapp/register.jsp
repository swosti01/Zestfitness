
<!DOCTYPE html>
<html>
    <head>
        <title>Login & Registration Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="asset/css/style.css">

        <link href="https://fonts.googleapis.com/css?family=Nunito:400,600,700,800&display=swap" rel="stylesheet">
                <script>
            function validate_password() {
                var pass = document.getElementById('pass').value;
                var confirm_pass = document.getElementById('confirm_pass').value;
                console.log(pass + " " + confirm_pass)
                if (pass === confirm_pass) {
                    return true;
                } else {
                    alert("Wromg password");
                    returm false;
                }
            }
        </script>       
    </head>
    <body>
<!--        sign in starts from here-->
        <div class="cont">
            <div class="form sign-in">
                <form action="user?page=login"  method="post">
                    <h2>Sign In</h2>

                    <label>
                        <span>Username</span>
                        <input type="text" name="username">
                    </label>
                    <label>
                        <span>Password</span>
                        <input type="password" name="password">
                    </label>

                    <input type="submit" value="Sign In" id="sub" class="submit">
                        
                </form>
            </div>

            <div class="sub-cont">
                <div class="img">
                    <div class="img-text m-up">
                        <h1>New here?</h1>
                        <p>sign up and discover</p>
                        <img class="mb-4" src="asset/img/logo.jpg" alt="" width="150" height="130" text-align="center">
                    </div>

                    <div class="img-text m-in">
                        <h1>One of us?</h1>
                        <p>just sign in</p>
                        <img class="mb-4" src="asset/img/logo.jpg" alt="" width="150" height="130" text-align="center">
                    </div>
                    <div class="img-btn">
                        <span class="m-up">Sign Up</span>
                        <span class="m-in">Sign In</span>
                    </div>
                </div>
                
                <!--sign up starts from here-->
                
                <div class="form sign-up">
                    <form action="user?page=newuser"  method="post">
                        <h2>Sign Up</h2>
                        <label>
                            <span>username</span>
                            <input type="text" name="username">
                        </label>
                        <label>
                            <span>full name</span>
                            <input type="text" name="fullname">
                        </label>
                        <label>
                            <span>Password</span>
                            <input type="password" name="password" id="pass">
                        </label>
                        <label>
                            <span>Confirm Password</span>
                            <input type="password" id="confirm_pass">
                        </label>
                        <input type="submit" value="Sign Up" onclick="return validate_password()" class="submit">
                    </form>
                </div>
            </div>
        </div>
        <script>
            document.querySelector('.img-btn').addEventListener('click', function ()
            {
                document.querySelector('.cont').classList.toggle('s-signup')
            }
            );</script>
    </body>
</html>