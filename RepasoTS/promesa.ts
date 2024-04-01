(
    async () => {
        function delay(time: number) {
            const promise = new Promise<string>((resolve) => {
                setTimeout(() => {
                    resolve('Soy una promesa me demoro :(');
                    console.log("Hola")
                }, time)
            });
            return promise;
        }
        const result = await delay(3000); // Wait for 3 seconds
        console.log(result);
    }
)();
