# tornimo-demo-spring-app
An example application using Spring framework, that sends metrics to [Tornimo.io](https://tornimo.io).  
It uses our [tornimo-spring-reporter](https://github.com/tornimo/tornimo-spring-reporter) for sending metrics.

## How to run it 
1) If you haven't done so, signup for a free account at [tornimo.io](https://tornimo.io/start-free-trial/)
2) After a few minutes, you will receive a link to your dashboard, url for data ingestion and a token. 
Fill configuration in application.properties as in configuration step.
3) Run this application.

## Configuration
``` 
management.metrics.export.tornimo.token=b55670fd-ea50-40e4-9cf3-82d2ed46c629  # 1
management.metrics.export.tornimo.host=put.b55670fd.tornimo.io                # 2
management.metrics.export.tornimo.app=example-app                             # 3
``` 
1) Token provided during registration at [tornimo.io](tornimo.io)
2) URL for metrics ingestion, provided during registration.
3) Application name that will be injected into the metric path.

## How to create a dashboard
1) Go to [demo dashboard](https://demo.tornimo.io/d/iYJJmNnZz/spring-demo-application?orgId=1).
2) In the right top corner go to Dashboard Settings -> JSON Model.
3) Copy json model.
4) Go to your dashboard provided in the email received after registration.
5) Click on the name of the current dashboard (top left corner) -> Import dashboard.
6) Paste json model.
7) Adjust your variables in the drop down boxes.
8) You can hit existing rest endpoints to see metrics regarding HTTP pops up.
```bash
curl localhost:8080/example-error
curl localhost:8080/example
```
