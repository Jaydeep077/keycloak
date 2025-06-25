<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${realm.name}</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: #fff;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        .login-box h2 {
            margin-bottom: 1rem;
            color: #333;
        }
        .form-group {
            margin-bottom: 1rem;
        }
        .form-group label {
            display: block;
            margin-bottom: 0.3rem;
        }
        .form-group input {
            width: 100%;
            padding: 0.5rem;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        button {
            padding: 0.5rem 1rem;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>

</head>
<body>
    <div class="login-container">
        <div class="login-box">
            <h2>${realm.name}</h2>
            <form id="kc-form-login" action="${url.loginAction}" method="post">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input id="username" name="username" type="text" autofocus>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input id="password" name="password" type="password">
                </div>
                <div class="form-group">
                    <button type="submit">Login</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
