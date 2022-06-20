## actuator

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator

<br>

## prometheus

```bash
docker run \
    --name prometheus-leo \
    -d -p 9090:9090 \
    -v /Users/leo/lab/servers/spring-monitoring-sample/prometheus.yml:/etc/prometheus/prometheus.yml \
    prom/prometheus
```
```bash
docker run \
    --name grafana-leo \
    -d -p 3000:3000 grafana/grafana-oss
```

<br>

## 
