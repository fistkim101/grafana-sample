## actuator

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator

<br>

## prometheus

```bash
docker run \
    --name prometheus-local \
    -d -p 9090:9090 \
    -v /Users/jungkwonkim/Lab/App/grafana-sample/prometheus.yml:/etc/prometheus/prometheus.yml \
    -v /Users/jungkwonkim/Lab/App/grafana-sample/heap_memory_alert.yml:/etc/prometheus/heap_memory_alert.yml \
    prom/prometheus
```

```bash
docker run -d \
  --name alertmanager-local \
  -p 9093:9093 \
  -v /Users/jungkwonkim/Lab/App/grafana-sample/alertmanager.yml:/etc/alertmanager/alertmanager.yml \
  prom/alertmanager
```

```bash
docker run \
    --name grafana-local \
    -d -p 3000:3000 grafana/grafana-oss
```

<br>

## 
