package httpService

import (
	"io"
	"net/http"
)

func FetchData(url string) []byte {

	res, err := http.Get(url)

	if err != nil {
		panic(err)
	}
	defer res.Body.Close()

	body, err := io.ReadAll(res.Body)

	return body

}
