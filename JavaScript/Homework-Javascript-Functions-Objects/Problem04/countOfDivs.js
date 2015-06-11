function countDivs(html) {
    var result = 0,
        regex = '<div',
        match = html.indexOf(regex);
    while (match !== -1) {
        match = html.indexOf(regex, match + 1);
        result++;
    }
    console.log(result);
}

countDivs('<!DOCTYPE html><html><head lang="en"><meta charset="UTF-8"><title>index</title><script src="/yourScript.js" defer></script></head><body><div id="outerDiv"><div class="first"><div><div>hello</div></div></div><div>hi<div></div></div><div>I am a div</div></div></body></html>');