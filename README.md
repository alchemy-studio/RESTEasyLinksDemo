启动服务：

```bash
$ mvn jetty:run
```

访问服务：

```bash
$ http -v http://localhost:8080/links
GET /links HTTP/1.1
Accept: */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
Host: localhost:8080
User-Agent: HTTPie/1.0.3



HTTP/1.1 200 OK
Content-Length: 177
Content-Type: application/xml;charset=UTF-8
Date: Thu, 27 Feb 2020 13:02:29 GMT
Server: Jetty(9.4.24.v20191120)

<?xml version="1.0" encoding="UTF-8" standalone="yes"?><fruit xmlns:atom="http://www.w3.org/2005/Atom" name="Apple"><rest rel="self" href="http://localhost:8080/links"/></fruit>
```