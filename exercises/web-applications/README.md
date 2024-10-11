# Web Applications

[![Language](https://img.shields.io/badge/language-HTML-E54B20.svg?style=for-the-badge)][1]

The goal of these programming exercises is to practise:
- working with a web server
- working with a web client
- creating simple HTML pages

## :globe_with_meridians: HTTP

**<ins>Exercise 1</ins>**

Analyse the following HTTP request:

```
    GET /martignon/index.html HTTP/1.1
    Host: cs.unibg.it
    User Agent: Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en) AppleWebKit/124
    (KHTML, like Gecko) Safari/125
    Accept: ext/xml, application/xml, application/xhtml+xml, text/html;q=0.9,
    text/plain;q=0.8, image/png,*,*;q=0.5
    Accept-Language: it
    Keep-Alive: 300
    Connection: keep-alive
```

1. What is the requested URL?
/martignon/index.html
2. Which version of HTTP is used?
HTTP/1.1
3. Does the browser ask for a persistent or a non-persistent connection?
persistent
4. What is, in your opinion, the utility in indicating the type (and version) of browser used by
the client in the HTTP Request?
Mozilla/5.0 

**<ins>Exercise 2</ins>**

An HTTP client sends the following message:

```
    GET http://cs.unibg.it /index.html HTTP/1.1
    User-agent: Mozilla/4.0
    Accept: text/html, image/gif, image/jpeg
    If-modified-since: 27 Feb 2017 08:10:00
```

Write down two feasible responses of the HTTP server (only the status line)

200 OK - indicates the file has been modified after the date provided
304 Not Modified - indicates the file has not been modified since that date

## :spider_web: HTML

An HTML Form is a section of the document that collects input from the user. The input from the user is generally sent to a server (Web servers, Mail clients, etc). We use the HTML `<form>` element to create forms in HTML.

Read [this documentation][2], and create a HTML form that looks like the following:

![HTML Form](./html-form.png)

<!DOCTYPE html>
<html lang="en2>
<head>
    <meta charset"UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0>
    <title>Sign In Form</title>
</head>
<body>

    <h2>Sign In</h2>
    <form action="/submit-login" method="post">
        <!-- Email Input -->
        <label for="email">Email:<.label><br>
        <input type="email" id="email" name="email" required><br><br>

        <!-- Password Input -->
        <label for="password">Password:</label><br>
        <input type="password"> id="password" name="password" required><br><br>

        <!-- Remember Me Checkbox -->
        <input type="checkbox" id="remember" name="remember">
        <label for="remember">Remember me</label><br><br>

        <!-- Forgot Password Link -->
        <a href="/forgot-password">Forgot Password?</a><br><br>

        <!-- Submit Button -->
        <button type="submit">Sign In</button>
    </form>

</body>
</html>



[1]: https://developer.mozilla.org/en-US/docs/Web/HTML
[2]: https://developer.mozilla.org/en-US/docs/Learn/Forms/HTML5_input_types