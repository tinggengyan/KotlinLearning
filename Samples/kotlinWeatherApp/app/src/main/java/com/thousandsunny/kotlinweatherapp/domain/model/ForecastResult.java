package com.thousandsunny.kotlinweatherapp.domain.model;

import java.util.List;

/**
 * Created by SteveYan on 2017/12/28.
 */

public class ForecastResult {

    private CurrentEntity current;
    private ForecastDailyEntity forecastDaily;
    private ForecastHourlyEntity forecastHourly;
    private IndicesEntityX indices;
    private YesterdayEntity yesterday;
    private UrlEntity url;
    private BrandInfoEntityXX brandInfo;
    private AqiEntityXX aqi;
    private List<?> alerts;
    private List<PreHourEntity> preHour;

    public CurrentEntity getCurrent() {
        return current;
    }

    public void setCurrent(CurrentEntity current) {
        this.current = current;
    }

    public ForecastDailyEntity getForecastDaily() {
        return forecastDaily;
    }

    public void setForecastDaily(ForecastDailyEntity forecastDaily) {
        this.forecastDaily = forecastDaily;
    }

    public ForecastHourlyEntity getForecastHourly() {
        return forecastHourly;
    }

    public void setForecastHourly(ForecastHourlyEntity forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    public IndicesEntityX getIndices() {
        return indices;
    }

    public void setIndices(IndicesEntityX indices) {
        this.indices = indices;
    }

    public YesterdayEntity getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayEntity yesterday) {
        this.yesterday = yesterday;
    }

    public UrlEntity getUrl() {
        return url;
    }

    public void setUrl(UrlEntity url) {
        this.url = url;
    }

    public BrandInfoEntityXX getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfoEntityXX brandInfo) {
        this.brandInfo = brandInfo;
    }

    public AqiEntityXX getAqi() {
        return aqi;
    }

    public void setAqi(AqiEntityXX aqi) {
        this.aqi = aqi;
    }

    public List<?> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<?> alerts) {
        this.alerts = alerts;
    }

    public List<PreHourEntity> getPreHour() {
        return preHour;
    }

    public void setPreHour(List<PreHourEntity> preHour) {
        this.preHour = preHour;
    }

    public static class CurrentEntity {
        /**
         * feelsLike : {"unit":"℃","value":"-7"}
         * humidity : {"unit":"%","value":"61"}
         * pressure : {"unit":"mb","value":"1028.9"}
         * pubTime : 2017-12-28T09:25:00+08:00
         * temperature : {"unit":"℃","value":"-6"}
         * uvIndex : 6
         * visibility : {"unit":"km","value":""}
         * weather : 2
         * wind : {"direction":{"unit":"°","value":"0"},"speed":{"unit":"km/h","value":"3.0"}}
         */

        private FeelsLikeEntity feelsLike;
        private HumidityEntity humidity;
        private PressureEntity pressure;
        private String pubTime;
        private TemperatureEntity temperature;
        private String uvIndex;
        private VisibilityEntity visibility;
        private String weather;
        private WindEntity wind;

        public FeelsLikeEntity getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeEntity feelsLike) {
            this.feelsLike = feelsLike;
        }

        public HumidityEntity getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityEntity humidity) {
            this.humidity = humidity;
        }

        public PressureEntity getPressure() {
            return pressure;
        }

        public void setPressure(PressureEntity pressure) {
            this.pressure = pressure;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public TemperatureEntity getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureEntity temperature) {
            this.temperature = temperature;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public VisibilityEntity getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityEntity visibility) {
            this.visibility = visibility;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public WindEntity getWind() {
            return wind;
        }

        public void setWind(WindEntity wind) {
            this.wind = wind;
        }

        public static class FeelsLikeEntity {
            /**
             * unit : ℃
             * value : -7
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class HumidityEntity {
            /**
             * unit : %
             * value : 61
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureEntity {
            /**
             * unit : mb
             * value : 1028.9
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class TemperatureEntity {
            /**
             * unit : ℃
             * value : -6
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityEntity {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class WindEntity {
            /**
             * direction : {"unit":"°","value":"0"}
             * speed : {"unit":"km/h","value":"3.0"}
             */

            private DirectionEntity direction;
            private SpeedEntity speed;

            public DirectionEntity getDirection() {
                return direction;
            }

            public void setDirection(DirectionEntity direction) {
                this.direction = direction;
            }

            public SpeedEntity getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedEntity speed) {
                this.speed = speed;
            }

            public static class DirectionEntity {
                /**
                 * unit : °
                 * value : 0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class SpeedEntity {
                /**
                 * unit : km/h
                 * value : 3.0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }

    public static class ForecastDailyEntity {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2017-12-28T00:00:00+08:00","status":0,"value":[82,215,113,86,124,117,29,53,18,7,27,51,92,72,48]}
         * precipitationProbability : {"status":0,"value":["0","1","0","1","1"]}
         * pubTime : 2017-12-28T09:25:00+08:00
         * status : 0
         * sunRiseSet : {"status":0,"value":[{"from":"2017-12-28T07:35:00+08:00","to":"2017-12-28T16:56:00+08:00"},{"from":"2017-12-29T07:35:00+08:00","to":"2017-12-29T16:57:00+08:00"},{"from":"2017-12-30T07:36:00+08:00","to":"2017-12-30T16:58:00+08:00"},{"from":"2017-12-31T07:36:00+08:00","to":"2017-12-31T16:59:00+08:00"},{"from":"2018-01-01T07:36:00+08:00","to":"2018-01-01T17:00:00+08:00"},{"from":"2018-01-02T07:36:00+08:00","to":"2018-01-02T17:00:00+08:00"},{"from":"2018-01-03T07:36:00+08:00","to":"2018-01-03T17:01:00+08:00"},{"from":"2018-01-04T07:36:00+08:00","to":"2018-01-04T17:02:00+08:00"},{"from":"2018-01-05T07:36:00+08:00","to":"2018-01-05T17:03:00+08:00"},{"from":"2018-01-06T07:36:00+08:00","to":"2018-01-06T17:04:00+08:00"},{"from":"2018-01-07T07:36:00+08:00","to":"2018-01-07T17:05:00+08:00"},{"from":"2018-01-08T07:36:00+08:00","to":"2018-01-08T17:06:00+08:00"},{"from":"2018-01-09T07:36:00+08:00","to":"2018-01-09T17:07:00+08:00"},{"from":"2018-01-10T07:36:00+08:00","to":"2018-01-10T17:08:00+08:00"},{"from":"2018-01-11T07:35:00+08:00","to":"2018-01-11T17:09:00+08:00"}]}
         * temperature : {"status":0,"unit":"℃","value":[{"from":"4","to":"-7"},{"from":"6","to":"-3"},{"from":"5","to":"-5"},{"from":"4","to":"-7"},{"from":"2","to":"-7"},{"from":"3","to":"-5"},{"from":"3","to":"-6"},{"from":"1","to":"-6"},{"from":"-1","to":"-6"},{"from":"0","to":"-7"},{"from":"2","to":"-5"},{"from":"3","to":"-5"},{"from":"2","to":"-6"},{"from":"2","to":"-6"},{"from":"0","to":"-6"}]}
         * weather : {"status":0,"value":[{"from":"2","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"1"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"2","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"}]}
         * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"0","to":"0"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"270","to":"270"},{"from":"45","to":"45"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"3.0","to":"3.0"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"33.5","to":"33.5"}]}}
         */

        private AqiEntity aqi;
        private PrecipitationProbabilityEntity precipitationProbability;
        private String pubTime;
        private int status;
        private SunRiseSetEntity sunRiseSet;
        private TemperatureEntityX temperature;
        private WeatherEntity weather;
        private WindEntityX wind;

        public AqiEntity getAqi() {
            return aqi;
        }

        public void setAqi(AqiEntity aqi) {
            this.aqi = aqi;
        }

        public PrecipitationProbabilityEntity getPrecipitationProbability() {
            return precipitationProbability;
        }

        public void setPrecipitationProbability(PrecipitationProbabilityEntity precipitationProbability) {
            this.precipitationProbability = precipitationProbability;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public SunRiseSetEntity getSunRiseSet() {
            return sunRiseSet;
        }

        public void setSunRiseSet(SunRiseSetEntity sunRiseSet) {
            this.sunRiseSet = sunRiseSet;
        }

        public TemperatureEntityX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureEntityX temperature) {
            this.temperature = temperature;
        }

        public WeatherEntity getWeather() {
            return weather;
        }

        public void setWeather(WeatherEntity weather) {
            this.weather = weather;
        }

        public WindEntityX getWind() {
            return wind;
        }

        public void setWind(WindEntityX wind) {
            this.wind = wind;
        }

        public static class AqiEntity {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2017-12-28T00:00:00+08:00
             * status : 0
             * value : [82,215,113,86,124,117,29,53,18,7,27,51,92,72,48]
             */

            private BrandInfoEntity brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoEntity getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoEntity brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoEntity {
                private List<BrandsEntity> brands;

                public List<BrandsEntity> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsEntity> brands) {
                    this.brands = brands;
                }

                public static class BrandsEntity {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesEntity names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesEntity getNames() {
                        return names;
                    }

                    public void setNames(NamesEntity names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesEntity {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class PrecipitationProbabilityEntity {
            /**
             * status : 0
             * value : ["0","1","0","1","1"]
             */

            private int status;
            private List<String> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<String> getValue() {
                return value;
            }

            public void setValue(List<String> value) {
                this.value = value;
            }
        }

        public static class SunRiseSetEntity {
            /**
             * status : 0
             * value : [{"from":"2017-12-28T07:35:00+08:00","to":"2017-12-28T16:56:00+08:00"},{"from":"2017-12-29T07:35:00+08:00","to":"2017-12-29T16:57:00+08:00"},{"from":"2017-12-30T07:36:00+08:00","to":"2017-12-30T16:58:00+08:00"},{"from":"2017-12-31T07:36:00+08:00","to":"2017-12-31T16:59:00+08:00"},{"from":"2018-01-01T07:36:00+08:00","to":"2018-01-01T17:00:00+08:00"},{"from":"2018-01-02T07:36:00+08:00","to":"2018-01-02T17:00:00+08:00"},{"from":"2018-01-03T07:36:00+08:00","to":"2018-01-03T17:01:00+08:00"},{"from":"2018-01-04T07:36:00+08:00","to":"2018-01-04T17:02:00+08:00"},{"from":"2018-01-05T07:36:00+08:00","to":"2018-01-05T17:03:00+08:00"},{"from":"2018-01-06T07:36:00+08:00","to":"2018-01-06T17:04:00+08:00"},{"from":"2018-01-07T07:36:00+08:00","to":"2018-01-07T17:05:00+08:00"},{"from":"2018-01-08T07:36:00+08:00","to":"2018-01-08T17:06:00+08:00"},{"from":"2018-01-09T07:36:00+08:00","to":"2018-01-09T17:07:00+08:00"},{"from":"2018-01-10T07:36:00+08:00","to":"2018-01-10T17:08:00+08:00"},{"from":"2018-01-11T07:35:00+08:00","to":"2018-01-11T17:09:00+08:00"}]
             */

            private int status;
            private List<ValueEntity> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueEntity> getValue() {
                return value;
            }

            public void setValue(List<ValueEntity> value) {
                this.value = value;
            }

            public static class ValueEntity {
                /**
                 * from : 2017-12-28T07:35:00+08:00
                 * to : 2017-12-28T16:56:00+08:00
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class TemperatureEntityX {
            /**
             * status : 0
             * unit : ℃
             * value : [{"from":"4","to":"-7"},{"from":"6","to":"-3"},{"from":"5","to":"-5"},{"from":"4","to":"-7"},{"from":"2","to":"-7"},{"from":"3","to":"-5"},{"from":"3","to":"-6"},{"from":"1","to":"-6"},{"from":"-1","to":"-6"},{"from":"0","to":"-7"},{"from":"2","to":"-5"},{"from":"3","to":"-5"},{"from":"2","to":"-6"},{"from":"2","to":"-6"},{"from":"0","to":"-6"}]
             */

            private int status;
            private String unit;
            private List<ValueEntityX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<ValueEntityX> getValue() {
                return value;
            }

            public void setValue(List<ValueEntityX> value) {
                this.value = value;
            }

            public static class ValueEntityX {
                /**
                 * from : 4
                 * to : -7
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WeatherEntity {
            /**
             * status : 0
             * value : [{"from":"2","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"1"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"2","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"}]
             */

            private int status;
            private List<ValueEntityXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueEntityXX> getValue() {
                return value;
            }

            public void setValue(List<ValueEntityXX> value) {
                this.value = value;
            }

            public static class ValueEntityXX {
                /**
                 * from : 2
                 * to : 0
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WindEntityX {
            /**
             * direction : {"status":0,"unit":"°","value":[{"from":"0","to":"0"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"270","to":"270"},{"from":"45","to":"45"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"}]}
             * speed : {"status":0,"unit":"km/h","value":[{"from":"3.0","to":"3.0"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"33.5","to":"33.5"}]}
             */

            private DirectionEntityX direction;
            private SpeedEntityX speed;

            public DirectionEntityX getDirection() {
                return direction;
            }

            public void setDirection(DirectionEntityX direction) {
                this.direction = direction;
            }

            public SpeedEntityX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedEntityX speed) {
                this.speed = speed;
            }

            public static class DirectionEntityX {
                /**
                 * status : 0
                 * unit : °
                 * value : [{"from":"0","to":"0"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"270","to":"270"},{"from":"45","to":"45"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"315"}]
                 */

                private int status;
                private String unit;
                private List<ValueEntityXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueEntityXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueEntityXXX> value) {
                    this.value = value;
                }

                public static class ValueEntityXXX {
                    /**
                     * from : 0
                     * to : 0
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }

            public static class SpeedEntityX {
                /**
                 * status : 0
                 * unit : km/h
                 * value : [{"from":"3.0","to":"3.0"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"33.5","to":"33.5"}]
                 */

                private int status;
                private String unit;
                private List<ValueEntityXXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueEntityXXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueEntityXXXX> value) {
                    this.value = value;
                }

                public static class ValueEntityXXXX {
                    /**
                     * from : 3.0
                     * to : 3.0
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }
        }
    }

    public static class ForecastHourlyEntity {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2017-12-28T10:00:00+08:00","status":0,"value":[117,117,119,123,128,132,136,140,145,149,155,161,165,171,175,180,185,190,194,199,203,206,210]}
         * desc : 未来24小时晴
         * status : 0
         * temperature : {"pubTime":"2017-12-28T10:00:00+08:00","status":0,"unit":"℃","value":[0,2,2,3,4,4,4,3,2,1,0,0,-1,-1,-2,-2,-2,-2,-3,-3,-1,0,0]}
         * weather : {"pubTime":"2017-12-28T10:00:00+08:00","status":0,"value":[1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,53,53,53]}
         * wind : {"status":0,"value":[{"datetime":"2017-12-28T10:00:00.000+08:00","direction":"36.21","speed":"5.16"},{"datetime":"2017-12-28T11:00:00.000+08:00","direction":"42.07","speed":"5.18"},{"datetime":"2017-12-28T12:00:00.000+08:00","direction":"50.04","speed":"4.9"},{"datetime":"2017-12-28T13:00:00.000+08:00","direction":"59.21","speed":"4.44"},{"datetime":"2017-12-28T14:00:00.000+08:00","direction":"66.66","speed":"3.9"},{"datetime":"2017-12-28T15:00:00.000+08:00","direction":"68.55","speed":"3.23"},{"datetime":"2017-12-28T16:00:00.000+08:00","direction":"64.48","speed":"2.53"},{"datetime":"2017-12-28T17:00:00.000+08:00","direction":"56.34","speed":"1.97"},{"datetime":"2017-12-28T18:00:00.000+08:00","direction":"50.44","speed":"1.65"},{"datetime":"2017-12-28T19:00:00.000+08:00","direction":"50.29","speed":"1.46"},{"datetime":"2017-12-28T20:00:00.000+08:00","direction":"55.87","speed":"1.31"},{"datetime":"2017-12-28T21:00:00.000+08:00","direction":"66.48","speed":"1.18"},{"datetime":"2017-12-28T22:00:00.000+08:00","direction":"81.49","speed":"1.15"},{"datetime":"2017-12-28T23:00:00.000+08:00","direction":"96.11","speed":"1.29"},{"datetime":"2017-12-29T00:00:00.000+08:00","direction":"105.05","speed":"1.59"},{"datetime":"2017-12-29T01:00:00.000+08:00","direction":"108.31","speed":"1.96"},{"datetime":"2017-12-29T02:00:00.000+08:00","direction":"107.72","speed":"2.29"},{"datetime":"2017-12-29T03:00:00.000+08:00","direction":"104.22","speed":"2.51"},{"datetime":"2017-12-29T04:00:00.000+08:00","direction":"98.18","speed":"2.61"},{"datetime":"2017-12-29T05:00:00.000+08:00","direction":"89.23","speed":"2.61"},{"datetime":"2017-12-29T06:00:00.000+08:00","direction":"77.85","speed":"2.56"},{"datetime":"2017-12-29T07:00:00.000+08:00","direction":"70.41","speed":"2.51"},{"datetime":"2017-12-29T08:00:00.000+08:00","direction":"75.79","speed":"2.37"},{"datetime":"2017-12-29T10:00:00.000+08:00","direction":"122.34","speed":"3.2"},{"datetime":"2017-12-29T11:00:00.000+08:00","direction":"129.0","speed":"4.15"},{"datetime":"2017-12-29T12:00:00.000+08:00","direction":"124.1","speed":"4.72"},{"datetime":"2017-12-29T13:00:00.000+08:00","direction":"114.59","speed":"4.91"},{"datetime":"2017-12-29T14:00:00.000+08:00","direction":"104.87","speed":"4.69"},{"datetime":"2017-12-29T15:00:00.000+08:00","direction":"96.66","speed":"3.93"},{"datetime":"2017-12-29T16:00:00.000+08:00","direction":"86.98","speed":"3.02"},{"datetime":"2017-12-29T17:00:00.000+08:00","direction":"74.38","speed":"2.5"},{"datetime":"2017-12-29T18:00:00.000+08:00","direction":"66.52","speed":"2.72"},{"datetime":"2017-12-29T19:00:00.000+08:00","direction":"67.19","speed":"3.21"},{"datetime":"2017-12-29T20:00:00.000+08:00","direction":"73.72","speed":"3.42"},{"datetime":"2017-12-29T21:00:00.000+08:00","direction":"86.95","speed":"3.11"},{"datetime":"2017-12-29T22:00:00.000+08:00","direction":"106.33","speed":"2.63"},{"datetime":"2017-12-29T23:00:00.000+08:00","direction":"125.25","speed":"2.14"},{"datetime":"2017-12-30T00:00:00.000+08:00","direction":"134.06","speed":"1.36"},{"datetime":"2017-12-30T01:00:00.000+08:00","direction":"97.82","speed":"0.29"},{"datetime":"2017-12-30T02:00:00.000+08:00","direction":"347.41","speed":"1.21"},{"datetime":"2017-12-30T03:00:00.000+08:00","direction":"343.29","speed":"2.6"},{"datetime":"2017-12-30T04:00:00.000+08:00","direction":"337.03","speed":"4.28"},{"datetime":"2017-12-30T05:00:00.000+08:00","direction":"327.1","speed":"6.71"},{"datetime":"2017-12-30T06:00:00.000+08:00","direction":"317.52","speed":"10.39"},{"datetime":"2017-12-30T07:00:00.000+08:00","direction":"311.97","speed":"14.73"},{"datetime":"2017-12-30T08:00:00.000+08:00","direction":"309.92","speed":"18.72"}]}
         */

        private AqiEntityX aqi;
        private String desc;
        private int status;
        private TemperatureEntityXX temperature;
        private WeatherEntityX weather;
        private WindEntityXX wind;

        public AqiEntityX getAqi() {
            return aqi;
        }

        public void setAqi(AqiEntityX aqi) {
            this.aqi = aqi;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public TemperatureEntityXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureEntityXX temperature) {
            this.temperature = temperature;
        }

        public WeatherEntityX getWeather() {
            return weather;
        }

        public void setWeather(WeatherEntityX weather) {
            this.weather = weather;
        }

        public WindEntityXX getWind() {
            return wind;
        }

        public void setWind(WindEntityXX wind) {
            this.wind = wind;
        }

        public static class AqiEntityX {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2017-12-28T10:00:00+08:00
             * status : 0
             * value : [117,117,119,123,128,132,136,140,145,149,155,161,165,171,175,180,185,190,194,199,203,206,210]
             */

            private BrandInfoEntityX brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoEntityX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoEntityX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoEntityX {
                private List<BrandsEntityX> brands;

                public List<BrandsEntityX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsEntityX> brands) {
                    this.brands = brands;
                }

                public static class BrandsEntityX {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesEntityX names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesEntityX getNames() {
                        return names;
                    }

                    public void setNames(NamesEntityX names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesEntityX {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureEntityXX {
            /**
             * pubTime : 2017-12-28T10:00:00+08:00
             * status : 0
             * unit : ℃
             * value : [0,2,2,3,4,4,4,3,2,1,0,0,-1,-1,-2,-2,-2,-2,-3,-3,-1,0,0]
             */

            private String pubTime;
            private int status;
            private String unit;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WeatherEntityX {
            /**
             * pubTime : 2017-12-28T10:00:00+08:00
             * status : 0
             * value : [1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,53,53,53]
             */

            private String pubTime;
            private int status;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WindEntityXX {
            /**
             * status : 0
             * value : [{"datetime":"2017-12-28T10:00:00.000+08:00","direction":"36.21","speed":"5.16"},{"datetime":"2017-12-28T11:00:00.000+08:00","direction":"42.07","speed":"5.18"},{"datetime":"2017-12-28T12:00:00.000+08:00","direction":"50.04","speed":"4.9"},{"datetime":"2017-12-28T13:00:00.000+08:00","direction":"59.21","speed":"4.44"},{"datetime":"2017-12-28T14:00:00.000+08:00","direction":"66.66","speed":"3.9"},{"datetime":"2017-12-28T15:00:00.000+08:00","direction":"68.55","speed":"3.23"},{"datetime":"2017-12-28T16:00:00.000+08:00","direction":"64.48","speed":"2.53"},{"datetime":"2017-12-28T17:00:00.000+08:00","direction":"56.34","speed":"1.97"},{"datetime":"2017-12-28T18:00:00.000+08:00","direction":"50.44","speed":"1.65"},{"datetime":"2017-12-28T19:00:00.000+08:00","direction":"50.29","speed":"1.46"},{"datetime":"2017-12-28T20:00:00.000+08:00","direction":"55.87","speed":"1.31"},{"datetime":"2017-12-28T21:00:00.000+08:00","direction":"66.48","speed":"1.18"},{"datetime":"2017-12-28T22:00:00.000+08:00","direction":"81.49","speed":"1.15"},{"datetime":"2017-12-28T23:00:00.000+08:00","direction":"96.11","speed":"1.29"},{"datetime":"2017-12-29T00:00:00.000+08:00","direction":"105.05","speed":"1.59"},{"datetime":"2017-12-29T01:00:00.000+08:00","direction":"108.31","speed":"1.96"},{"datetime":"2017-12-29T02:00:00.000+08:00","direction":"107.72","speed":"2.29"},{"datetime":"2017-12-29T03:00:00.000+08:00","direction":"104.22","speed":"2.51"},{"datetime":"2017-12-29T04:00:00.000+08:00","direction":"98.18","speed":"2.61"},{"datetime":"2017-12-29T05:00:00.000+08:00","direction":"89.23","speed":"2.61"},{"datetime":"2017-12-29T06:00:00.000+08:00","direction":"77.85","speed":"2.56"},{"datetime":"2017-12-29T07:00:00.000+08:00","direction":"70.41","speed":"2.51"},{"datetime":"2017-12-29T08:00:00.000+08:00","direction":"75.79","speed":"2.37"},{"datetime":"2017-12-29T10:00:00.000+08:00","direction":"122.34","speed":"3.2"},{"datetime":"2017-12-29T11:00:00.000+08:00","direction":"129.0","speed":"4.15"},{"datetime":"2017-12-29T12:00:00.000+08:00","direction":"124.1","speed":"4.72"},{"datetime":"2017-12-29T13:00:00.000+08:00","direction":"114.59","speed":"4.91"},{"datetime":"2017-12-29T14:00:00.000+08:00","direction":"104.87","speed":"4.69"},{"datetime":"2017-12-29T15:00:00.000+08:00","direction":"96.66","speed":"3.93"},{"datetime":"2017-12-29T16:00:00.000+08:00","direction":"86.98","speed":"3.02"},{"datetime":"2017-12-29T17:00:00.000+08:00","direction":"74.38","speed":"2.5"},{"datetime":"2017-12-29T18:00:00.000+08:00","direction":"66.52","speed":"2.72"},{"datetime":"2017-12-29T19:00:00.000+08:00","direction":"67.19","speed":"3.21"},{"datetime":"2017-12-29T20:00:00.000+08:00","direction":"73.72","speed":"3.42"},{"datetime":"2017-12-29T21:00:00.000+08:00","direction":"86.95","speed":"3.11"},{"datetime":"2017-12-29T22:00:00.000+08:00","direction":"106.33","speed":"2.63"},{"datetime":"2017-12-29T23:00:00.000+08:00","direction":"125.25","speed":"2.14"},{"datetime":"2017-12-30T00:00:00.000+08:00","direction":"134.06","speed":"1.36"},{"datetime":"2017-12-30T01:00:00.000+08:00","direction":"97.82","speed":"0.29"},{"datetime":"2017-12-30T02:00:00.000+08:00","direction":"347.41","speed":"1.21"},{"datetime":"2017-12-30T03:00:00.000+08:00","direction":"343.29","speed":"2.6"},{"datetime":"2017-12-30T04:00:00.000+08:00","direction":"337.03","speed":"4.28"},{"datetime":"2017-12-30T05:00:00.000+08:00","direction":"327.1","speed":"6.71"},{"datetime":"2017-12-30T06:00:00.000+08:00","direction":"317.52","speed":"10.39"},{"datetime":"2017-12-30T07:00:00.000+08:00","direction":"311.97","speed":"14.73"},{"datetime":"2017-12-30T08:00:00.000+08:00","direction":"309.92","speed":"18.72"}]
             */

            private int status;
            private List<ValueEntityXXXXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueEntityXXXXX> getValue() {
                return value;
            }

            public void setValue(List<ValueEntityXXXXX> value) {
                this.value = value;
            }

            public static class ValueEntityXXXXX {
                /**
                 * datetime : 2017-12-28T10:00:00.000+08:00
                 * direction : 36.21
                 * speed : 5.16
                 */

                private String datetime;
                private String direction;
                private String speed;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getSpeed() {
                    return speed;
                }

                public void setSpeed(String speed) {
                    this.speed = speed;
                }
            }
        }
    }

    public static class IndicesEntityX {
        /**
         * indices : [{"type":"uvIndex","value":"5"},{"type":"humidity","value":"61"},{"type":"feelsLike","value":"-7.7"},{"type":"pressure","value":"1029.0"},{"type":"carWash","value":"0"},{"type":"sports","value":"1"}]
         * pubTime :
         * status : 0
         */

        private String pubTime;
        private int status;
        private List<IndicesEntity> indices;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<IndicesEntity> getIndices() {
            return indices;
        }

        public void setIndices(List<IndicesEntity> indices) {
            this.indices = indices;
        }

        public static class IndicesEntity {
            /**
             * type : uvIndex
             * value : 5
             */

            private String type;
            private String value;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class YesterdayEntity {
        /**
         * aqi : 128
         * date : 2017-12-27T12:10:00+08:00
         * status : 0
         * sunRise : 2017-12-27T07:34:00+08:00
         * sunSet : 2017-12-27T16:56:00+08:00
         * tempMax : 4
         * tempMin : -7
         * weatherEnd : 0
         * weatherStart : 1
         * windDircEnd : 0
         * windDircStart : 0
         * windSpeedEnd : 15.5
         * windSpeedStart : 15.5
         */

        private String aqi;
        private String date;
        private int status;
        private String sunRise;
        private String sunSet;
        private String tempMax;
        private String tempMin;
        private String weatherEnd;
        private String weatherStart;
        private String windDircEnd;
        private String windDircStart;
        private String windSpeedEnd;
        private String windSpeedStart;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSunRise() {
            return sunRise;
        }

        public void setSunRise(String sunRise) {
            this.sunRise = sunRise;
        }

        public String getSunSet() {
            return sunSet;
        }

        public void setSunSet(String sunSet) {
            this.sunSet = sunSet;
        }

        public String getTempMax() {
            return tempMax;
        }

        public void setTempMax(String tempMax) {
            this.tempMax = tempMax;
        }

        public String getTempMin() {
            return tempMin;
        }

        public void setTempMin(String tempMin) {
            this.tempMin = tempMin;
        }

        public String getWeatherEnd() {
            return weatherEnd;
        }

        public void setWeatherEnd(String weatherEnd) {
            this.weatherEnd = weatherEnd;
        }

        public String getWeatherStart() {
            return weatherStart;
        }

        public void setWeatherStart(String weatherStart) {
            this.weatherStart = weatherStart;
        }

        public String getWindDircEnd() {
            return windDircEnd;
        }

        public void setWindDircEnd(String windDircEnd) {
            this.windDircEnd = windDircEnd;
        }

        public String getWindDircStart() {
            return windDircStart;
        }

        public void setWindDircStart(String windDircStart) {
            this.windDircStart = windDircStart;
        }

        public String getWindSpeedEnd() {
            return windSpeedEnd;
        }

        public void setWindSpeedEnd(String windSpeedEnd) {
            this.windSpeedEnd = windSpeedEnd;
        }

        public String getWindSpeedStart() {
            return windSpeedStart;
        }

        public void setWindSpeedStart(String windSpeedStart) {
            this.windSpeedStart = windSpeedStart;
        }
    }

    public static class UrlEntity {
        /**
         * weathercn :
         * caiyun :
         */

        private String weathercn;
        private String caiyun;

        public String getWeathercn() {
            return weathercn;
        }

        public void setWeathercn(String weathercn) {
            this.weathercn = weathercn;
        }

        public String getCaiyun() {
            return caiyun;
        }

        public void setCaiyun(String caiyun) {
            this.caiyun = caiyun;
        }
    }

    public static class BrandInfoEntityXX {
        private List<BrandsEntityXX> brands;

        public List<BrandsEntityXX> getBrands() {
            return brands;
        }

        public void setBrands(List<BrandsEntityXX> brands) {
            this.brands = brands;
        }

        public static class BrandsEntityXX {
            /**
             * brandId : caiyun
             * logo : http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp
             * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
             * url :
             */

            private String brandId;
            private String logo;
            private NamesEntityXX names;
            private String url;

            public String getBrandId() {
                return brandId;
            }

            public void setBrandId(String brandId) {
                this.brandId = brandId;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public NamesEntityXX getNames() {
                return names;
            }

            public void setNames(NamesEntityXX names) {
                this.names = names;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class NamesEntityXX {
                /**
                 * en_US : 彩云天气
                 * zh_TW : 彩雲天氣
                 * zh_CN : 彩云天气
                 */

                private String en_US;
                private String zh_TW;
                private String zh_CN;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }
            }
        }
    }

    public static class AqiEntityXX {
        /**
         * pubTime : 2017-12-28T08:00:00+08:00
         * so2 : 12
         * pm10Desc : PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物
         * o3 : 3
         * status : 0
         * no2Desc : 二氧化氮是硝酸盐气溶胶的主要来源，是构成PM2.5和紫外线作用下产生臭氧的主要成分
         * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
         * so2Desc : 人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼
         * co : 1.25
         * o3Desc : 臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳
         * no2 : 68
         * primary :
         * aqi : 82
         * pm10 : 66
         * coDesc : 一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害
         * src : 中国环境监测总站
         * pm25 : 60
         * pm25Desc : PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康
         * brandInfo : {"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
         */

        private String pubTime;
        private String so2;
        private String pm10Desc;
        private String o3;
        private int status;
        private String no2Desc;
        private String suggest;
        private String so2Desc;
        private String co;
        private String o3Desc;
        private String no2;
        private String primary;
        private String aqi;
        private String pm10;
        private String coDesc;
        private String src;
        private String pm25;
        private String pm25Desc;
        private BrandInfoEntityXXX brandInfo;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getPm10Desc() {
            return pm10Desc;
        }

        public void setPm10Desc(String pm10Desc) {
            this.pm10Desc = pm10Desc;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getNo2Desc() {
            return no2Desc;
        }

        public void setNo2Desc(String no2Desc) {
            this.no2Desc = no2Desc;
        }

        public String getSuggest() {
            return suggest;
        }

        public void setSuggest(String suggest) {
            this.suggest = suggest;
        }

        public String getSo2Desc() {
            return so2Desc;
        }

        public void setSo2Desc(String so2Desc) {
            this.so2Desc = so2Desc;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3Desc() {
            return o3Desc;
        }

        public void setO3Desc(String o3Desc) {
            this.o3Desc = o3Desc;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getCoDesc() {
            return coDesc;
        }

        public void setCoDesc(String coDesc) {
            this.coDesc = coDesc;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm25Desc() {
            return pm25Desc;
        }

        public void setPm25Desc(String pm25Desc) {
            this.pm25Desc = pm25Desc;
        }

        public BrandInfoEntityXXX getBrandInfo() {
            return brandInfo;
        }

        public void setBrandInfo(BrandInfoEntityXXX brandInfo) {
            this.brandInfo = brandInfo;
        }

        public static class BrandInfoEntityXXX {
            private List<BrandsEntityXXX> brands;

            public List<BrandsEntityXXX> getBrands() {
                return brands;
            }

            public void setBrands(List<BrandsEntityXXX> brands) {
                this.brands = brands;
            }

            public static class BrandsEntityXXX {
                /**
                 * logo :
                 * names : {"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"}
                 * brandId : CNEMC
                 * url :
                 */

                private String logo;
                private NamesEntityXXX names;
                private String brandId;
                private String url;

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public NamesEntityXXX getNames() {
                    return names;
                }

                public void setNames(NamesEntityXXX names) {
                    this.names = names;
                }

                public String getBrandId() {
                    return brandId;
                }

                public void setBrandId(String brandId) {
                    this.brandId = brandId;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class NamesEntityXXX {
                    /**
                     * en_US : CNEMC
                     * zh_TW : 中國環境監測總站
                     * zh_CN : 中国环境监测总站
                     */

                    private String en_US;
                    private String zh_TW;
                    private String zh_CN;

                    public String getEn_US() {
                        return en_US;
                    }

                    public void setEn_US(String en_US) {
                        this.en_US = en_US;
                    }

                    public String getZh_TW() {
                        return zh_TW;
                    }

                    public void setZh_TW(String zh_TW) {
                        this.zh_TW = zh_TW;
                    }

                    public String getZh_CN() {
                        return zh_CN;
                    }

                    public void setZh_CN(String zh_CN) {
                        this.zh_CN = zh_CN;
                    }
                }
            }
        }
    }

    public static class PreHourEntity {
        /**
         * pubTime : 2017-12-28T09:00:00+08:00
         * wind : {"speed":{"unit":"km/h","value":"3.0"},"direction":{"unit":"°","value":"0"}}
         * humidity : {"unit":"%","value":"61"}
         * pressure : {"unit":"mb","value":"1027.3"}
         * visibility : {"unit":"km","value":""}
         * feelsLike : {"unit":"℃","value":"-8"}
         * aqi : {"pubTime":"2017-12-28T07:00:00+08:00","so2":"12","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"4","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响","so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","co":"1.05","o3Desc":"空气中过多臭氧可能导致呼吸问题，引发哮喘，降低肺功能并引起肺部疾病，对人类健康影响较大","no2":"64","primary":"","aqi":"76","coDesc":"一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常","pm10":"55","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","pm25":"56","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
         * uvIndex : 6
         * weather : 2
         * temperature : {"unit":"℃","value":"-6"}
         */

        private String pubTime;
        private WindEntityXXX wind;
        private HumidityEntityX humidity;
        private PressureEntityX pressure;
        private VisibilityEntityX visibility;
        private FeelsLikeEntityX feelsLike;
        private AqiEntityXXX aqi;
        private String uvIndex;
        private String weather;
        private TemperatureEntityXXX temperature;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public WindEntityXXX getWind() {
            return wind;
        }

        public void setWind(WindEntityXXX wind) {
            this.wind = wind;
        }

        public HumidityEntityX getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityEntityX humidity) {
            this.humidity = humidity;
        }

        public PressureEntityX getPressure() {
            return pressure;
        }

        public void setPressure(PressureEntityX pressure) {
            this.pressure = pressure;
        }

        public VisibilityEntityX getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityEntityX visibility) {
            this.visibility = visibility;
        }

        public FeelsLikeEntityX getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeEntityX feelsLike) {
            this.feelsLike = feelsLike;
        }

        public AqiEntityXXX getAqi() {
            return aqi;
        }

        public void setAqi(AqiEntityXXX aqi) {
            this.aqi = aqi;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public TemperatureEntityXXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureEntityXXX temperature) {
            this.temperature = temperature;
        }

        public static class WindEntityXXX {
            /**
             * speed : {"unit":"km/h","value":"3.0"}
             * direction : {"unit":"°","value":"0"}
             */

            private SpeedEntityXX speed;
            private DirectionEntityXX direction;

            public SpeedEntityXX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedEntityXX speed) {
                this.speed = speed;
            }

            public DirectionEntityXX getDirection() {
                return direction;
            }

            public void setDirection(DirectionEntityXX direction) {
                this.direction = direction;
            }

            public static class SpeedEntityXX {
                /**
                 * unit : km/h
                 * value : 3.0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class DirectionEntityXX {
                /**
                 * unit : °
                 * value : 0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class HumidityEntityX {
            /**
             * unit : %
             * value : 61
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureEntityX {
            /**
             * unit : mb
             * value : 1027.3
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityEntityX {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class FeelsLikeEntityX {
            /**
             * unit : ℃
             * value : -8
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class AqiEntityXXX {
            /**
             * pubTime : 2017-12-28T07:00:00+08:00
             * so2 : 12
             * pm10Desc : PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌
             * o3 : 4
             * status : 0
             * no2Desc : 二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到
             * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
             * so2Desc : 人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼
             * co : 1.05
             * o3Desc : 空气中过多臭氧可能导致呼吸问题，引发哮喘，降低肺功能并引起肺部疾病，对人类健康影响较大
             * no2 : 64
             * primary :
             * aqi : 76
             * coDesc : 一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常
             * pm10 : 55
             * pm25Desc : PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康
             * pm25 : 56
             * src : 中国环境监测总站
             * brandInfo : {"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
             */

            private String pubTime;
            private String so2;
            private String pm10Desc;
            private String o3;
            private int status;
            private String no2Desc;
            private String suggest;
            private String so2Desc;
            private String co;
            private String o3Desc;
            private String no2;
            private String primary;
            private String aqi;
            private String coDesc;
            private String pm10;
            private String pm25Desc;
            private String pm25;
            private String src;
            private BrandInfoEntityXXXX brandInfo;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getPm10Desc() {
                return pm10Desc;
            }

            public void setPm10Desc(String pm10Desc) {
                this.pm10Desc = pm10Desc;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getNo2Desc() {
                return no2Desc;
            }

            public void setNo2Desc(String no2Desc) {
                this.no2Desc = no2Desc;
            }

            public String getSuggest() {
                return suggest;
            }

            public void setSuggest(String suggest) {
                this.suggest = suggest;
            }

            public String getSo2Desc() {
                return so2Desc;
            }

            public void setSo2Desc(String so2Desc) {
                this.so2Desc = so2Desc;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getO3Desc() {
                return o3Desc;
            }

            public void setO3Desc(String o3Desc) {
                this.o3Desc = o3Desc;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getPrimary() {
                return primary;
            }

            public void setPrimary(String primary) {
                this.primary = primary;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getCoDesc() {
                return coDesc;
            }

            public void setCoDesc(String coDesc) {
                this.coDesc = coDesc;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25Desc() {
                return pm25Desc;
            }

            public void setPm25Desc(String pm25Desc) {
                this.pm25Desc = pm25Desc;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public BrandInfoEntityXXXX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoEntityXXXX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public static class BrandInfoEntityXXXX {
                private List<BrandsEntityXXXX> brands;

                public List<BrandsEntityXXXX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsEntityXXXX> brands) {
                    this.brands = brands;
                }

                public static class BrandsEntityXXXX {
                    /**
                     * logo :
                     * names : {"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"}
                     * brandId : CNEMC
                     * url :
                     */

                    private String logo;
                    private NamesEntityXXXX names;
                    private String brandId;
                    private String url;

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesEntityXXXX getNames() {
                        return names;
                    }

                    public void setNames(NamesEntityXXXX names) {
                        this.names = names;
                    }

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesEntityXXXX {
                        /**
                         * zh_TW : 中國環境監測總站
                         * en_US : CNEMC
                         * zh_CN : 中国环境监测总站
                         */

                        private String zh_TW;
                        private String en_US;
                        private String zh_CN;

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureEntityXXX {
            /**
             * unit : ℃
             * value : -6
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}
